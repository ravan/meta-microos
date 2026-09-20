#
# Toolchain mode: Yocto builds the cross compiler, MicroOS supplies the sysroot.
#
# Compare with tcmode-external-microos.inc, which does the opposite: it takes a
# prebuilt openSUSE cross compiler from a directory somebody has to populate by
# hand (EXTERNAL_TOOLCHAIN=/usr/local/cross-sdk).
#
# Here BitBake builds binutils-cross and gcc-cross from source, the way it does
# for any other Yocto target. Everything the compiler links against - the C
# library, the kernel headers, libgcc, libstdc++ - keeps coming from openSUSE's
# own signed RPMs through rpm.bbclass. The signature chain of the base system is
# not touched; only the compiler binary is ours.
#
# Version rule: the gcc that Yocto builds must be the same age or OLDER than the
# gcc that built MicroOS's runtime libraries. libstdc++ and libgcc_s are
# backwards compatible, so old code runs against a new runtime, never the other
# way round. Today poky scarthgap builds gcc 13.4 and Tumbleweed's libstdc++6 and
# libgcc_s1 are built by gcc 16, so the rule holds with room to spare.
#

# MicroOS builds every RPM with the aarch64-suse-linux triple and bakes that
# string into paths such as /usr/lib64/gcc/aarch64-suse-linux/13. Use the same
# vendor so our compiler agrees with the sysroot it is pointed at.
TARGET_VENDOR = "-suse"

# openSUSE puts 64-bit libraries in /usr/lib64. Yocto takes baselib from the tune
# file, and several tunes leave it as "lib" - qemuarm64 resolves to the cortexa57
# tune, which has no BASE_LIB entry at all. The compiler then searches /usr/lib of
# a sysroot whose files are all in /usr/lib64, and every link fails with "cannot
# find Scrt1.o". Follow openSUSE's layout instead of the tune file's.
MICROOS_LIB64_ARCHS = "aarch64 x86_64 riscv64 powerpc64le s390x"
baselib = "${@'lib64' if d.getVar('TARGET_ARCH') in d.getVar('MICROOS_LIB64_ARCHS').split() else 'lib'}"

# The dynamic loader is the one library that does not follow baselib.
#
# Where a CPU keeps its loader is fixed by that CPU's ABI, not by the distro.
# Only x86_64 and powerpc64le name a path under /lib64; aarch64 asks for
# /lib/ld-linux-aarch64.so.1 and riscv64 for /lib/ld-linux-riscv64-lp64d.so.1.
# openSUSE follows the ABI, so on aarch64 the loader really is in /usr/lib while
# every other library is in /usr/lib64, and /lib is a symlink to /usr/lib.
#
# gcc bakes one absolute path into every dynamic executable it links, and poky
# builds that path from target_base_libdir, which cross.bbclass writes as
# ${target_base_prefix}/${baselib}. With baselib at lib64 the binary asks for
# /lib64/ld-linux-aarch64.so.1, nothing is there, and the kernel refuses to
# start it. The shell reports this as
#
#   -bash: /usr/bin/hello-learn: cannot execute: required file not found
#
# which says nothing about a loader. The gcc-cross bbappend reads the value
# below and overrides target_base_libdir with it.
MICROOS_LOADER_LIB64_ARCHS = "x86_64 powerpc64le"
MICROOS_LOADER_BASELIB = "${@'lib64' if d.getVar('TARGET_ARCH') in d.getVar('MICROOS_LOADER_LIB64_ARCHS').split() else 'lib'}"

# --- built from source by Yocto -------------------------------------------

PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}binutils = "binutils-cross-${TARGET_ARCH}"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc = "gcc-cross-${TARGET_ARCH}"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}g++ = "gcc-cross-${TARGET_ARCH}"

PREFERRED_PROVIDER_virtual/${SDK_PREFIX}binutils ?= "binutils-crosssdk-${SDK_SYS}"
PREFERRED_PROVIDER_virtual/${SDK_PREFIX}gcc ?= "gcc-crosssdk-${SDK_SYS}"
PREFERRED_PROVIDER_virtual/${SDK_PREFIX}g++ ?= "gcc-crosssdk-${SDK_SYS}"

# Which openSUSE gccNN package holds the crt*.o start files and libgcc.a that
# our compiler links every binary against. Must match GCCVERSION's major number:
# a gcc 13 driver expects gcc 13 start files.
MICROOS_GCC_MAJOR ?= "13"

GCCVERSION ?= "13.%"
BINUVERSION ?= "2.42%"
PREFERRED_VERSION_gcc-cross-${TARGET_ARCH} ?= "${GCCVERSION}"
PREFERRED_VERSION_binutils-cross-${TARGET_ARCH} ?= "${BINUVERSION}"
PREFERRED_VERSION_binutils-native ?= "${BINUVERSION}"

# --- taken from openSUSE's signed RPMs ------------------------------------

# Never build these from source. Doing so would put an unsigned copy of the C
# library or the compiler runtime beside the signed one and break the whole
# reason for using MicroOS as the base.
SKIP_RECIPE[libgcc] = "MicroOS supplies libgcc_s1"
SKIP_RECIPE[libgcc-initial] = "MicroOS supplies libgcc_s1"
SKIP_RECIPE[gcc-runtime] = "MicroOS supplies libstdc++6"
SKIP_RECIPE[gcc-sanitizers] = "MicroOS supplies the sanitizer libraries"
SKIP_RECIPE[glibc-initial] = "MicroOS supplies glibc-devel"
SKIP_RECIPE[linux-libc-headers] = "MicroOS supplies linux-glibc-devel"

PREFERRED_PROVIDER_virtual/libc = "glibc"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}libc-for-gcc = "glibc-devel"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}compilerlibs = "libstdc++6"
PREFERRED_PROVIDER_virtual/linux-libc-headers = "linux-glibc-devel"
PREFERRED_PROVIDER_virtual/crypt = "libcrypt1"

# The devel RPMs that make the sysroot a sysroot. gcc-cross needs them staged
# before it can configure, and every target recipe needs them to link. They are
# not part of the MicroOS runtime group, so `just cross-sysroot` links them in
# from the pool separately. See conf/sysroot-packages.txt.
MICROOS_SYSROOT_DEPENDS = " \
    glibc-devel \
    linux-glibc-devel \
    libxcrypt-devel \
    gcc${MICROOS_GCC_MAJOR} \
    libstdc++6-devel-gcc${MICROOS_GCC_MAJOR} \
"

# gcc-cross builds the driver and the compiler proper, but not the target start
# files, so crtbegin.o, crtend.o and libgcc.a come from the gccNN RPM. They cannot
# be used where the RPM puts them, because that directory also holds aarch64
# programs such as collect2 and -B makes gcc search for programs as well. The
# gcc13 bbappend copies the link-time files into a directory of their own.
MICROOS_STARTFILE_DIR ?= "${libdir}/microos-startfiles"
MICROOS_GCC_LIBDIR = "${STAGING_DIR_TARGET}${MICROOS_STARTFILE_DIR}"
TARGET_CC_ARCH:append = " -B${MICROOS_GCC_LIBDIR}"
TARGET_LDFLAGS:append = " -L${MICROOS_GCC_LIBDIR}"


# --- which openSUSE repository the RPMs come from -------------------------

# rpm.bbclass hardcodes the aarch64 ports repository. Follow TARGET_ARCH instead,
# so the same distro can target more than one CPU. Each CPU still needs its own
# generated pool, for example:
#     scripts/microos --arch riscv64 --pool pool-tumbleweed-riscv64
MICROOS_REPO_URL_x86_64 = "https://download.opensuse.org/tumbleweed/repo/oss"
MICROOS_REPO_URL_aarch64 = "https://download.opensuse.org/ports/aarch64/tumbleweed/repo/oss"
MICROOS_REPO_URL_riscv64 = "https://download.opensuse.org/ports/riscv/tumbleweed/repo/oss"
REPO_URL = "${MICROOS_REPO_URL_${TARGET_ARCH}}"
