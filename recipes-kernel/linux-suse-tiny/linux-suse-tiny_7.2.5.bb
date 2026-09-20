SUMMARY = "openSUSE's own kernel source, configured down to the minimum that boots"
DESCRIPTION = "The same kernel-source RPM openSUSE ships, with openSUSE's patches \
already applied, compiled here with a configuration built from allnoconfig plus \
one fragment. Nothing is added to the source and nothing is taken out of it; the \
only difference from kernel-default is which symbols are turned on. \
\
kernel-default in this layer is a passthrough: the signed binary is copied out of \
the RPM and never compiled. A signed binary cannot be made smaller, so this recipe \
is the other half of the pair - same vendor source, our own configuration, and no \
vendor signature, because we built it."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"
LINUX_VERSION = "7.2.5"

# It takes two RPMs to make one kernel tree.
#
# openSUSE splits the sources the way a distribution needs them and not the way
# a compiler does. kernel-source carries the code - arch, drivers, fs, mm and
# the rest - and nothing else: no Makefile, no Kconfig, no include and no
# scripts. Those are in kernel-devel, which exists so that an external module
# can be built against an installed kernel. Unpacked, the two RPMs write into
# the same directory and only together are they a tree `make` can enter.
#
# Both are noarch and come from the same repository and with the same checksums
# as pool-tumbleweed/kernel-source and pool-tumbleweed/kernel-devel, so the
# files are fetched once and shared with those recipes.
SUSE_KERNEL_REPO = "https://download.opensuse.org/ports/aarch64/tumbleweed/repo/oss/noarch"

SRC_URI = "${SUSE_KERNEL_REPO}/kernel-source-7.2.5-1.1.noarch.rpm;subdir=unrpm;name=source \
           ${SUSE_KERNEL_REPO}/kernel-devel-7.2.5-1.1.noarch.rpm;subdir=unrpm;name=devel \
           file://tiny.cfg \
           "
SRC_URI[source.sha512sum] = "165dd2e8bac8c8fc423f3fb4e9966b3e6e27d83683c96b49248d0cff076e00c029fcfa793dc6c0732ecb9b4b106f7bc347e59584c4dd01d7ca6456637240b9df"
SRC_URI[devel.sha512sum] = "be63af1cdb76a2922535ec408be43ac215d01ceed5d2534b95678d6305d93afc125e32acfe93477d0f24b0d7b4f5670d0a96f4a26a3378871e0b9827f235259c"

inherit kernel

# The RPM unpacks the whole tree under this one path.
#
# These two must come after the inherit. kernel.bbclass sets S itself, to the
# shared kernel source directory, and an inherit is read where it is written -
# so an S set above the inherit is quietly replaced and do_configure lands in an
# empty tree. do_symlink_kernsrc moves whatever S names into that shared
# directory and leaves a symlink behind, which is exactly what is wanted here.
S = "${WORKDIR}/unrpm/usr/src/linux-${PV}-1"
B = "${WORKDIR}/build"

# Do not offer to be the machine's kernel.
#
# kernel.bbclass claims virtual/kernel, and so does kernel-default.bbappend. Two
# providers of one name makes every image build ask which. This recipe is not
# meant to replace kernel-default anywhere; it deploys an Image that a QEMU run
# names directly, so it can simply stop claiming the name.
PROVIDES:remove = "virtual/kernel"

# Keep the packages and the deploy directory apart from kernel-default's.
#
# KERNEL_DEPLOYSUBDIR follows KERNEL_PACKAGE_NAME whenever it is not "kernel",
# so this also puts the Image in its own directory and leaves the signed
# kernel-default one untouched.
KERNEL_PACKAGE_NAME = "kernel-tiny"

KERNEL_IMAGETYPE = "Image"
KERNEL_LOCALVERSION = "-tiny"

# `make kernelversion` on this tree answers 7.2.5, which is PV, but openSUSE
# writes its release into the directory name rather than the Makefile. Skip the
# comparison rather than encode a guess about their versioning.
KERNEL_VERSION_SANITY_SKIP = "1"

# There is no source archive to checksum: the licence text ships inside a signed
# RPM, the same argument rpm.bbclass makes for every other recipe in this layer.
ERROR_QA:remove = "license-checksum"

# Build the configuration instead of shipping one.
#
# A defconfig checked in here would be 4000 lines of answers with no record of
# which ones were deliberate. Starting from allnoconfig and merging one readable
# fragment means the file in files/ is exactly the list of things this kernel
# was asked for, and olddefconfig afterwards fills in whatever those choices
# select.
do_configure:prepend() {
    install -d ${B}
    oe_runmake -C ${S} O=${B} allnoconfig
    ${S}/scripts/kconfig/merge_config.sh -m -O ${B} ${B}/.config ${WORKDIR}/tiny.cfg
}

# Say how big it came out, in the build log, every time.
do_compile:append() {
    bbplain "linux-suse-tiny: ${KERNEL_IMAGETYPE} is $(du -h ${B}/arch/${ARCH}/boot/${KERNEL_IMAGETYPE} | cut -f1)"
}

# Drop the make-mod-scripts dependency kernel.bbclass adds to do_clean.
#
# make-mod-scripts exists so out-of-tree modules can be built later, and this
# kernel has CONFIG_MODULES off, so there are none. Its do_configure asks
# virtual/kernel for do_shared_workdir; virtual/kernel in this layer is
# kernel-default, an unpacked RPM with no such task, and BitBake refuses to
# build the task graph at all rather than notice nothing will run it.
do_clean[depends] = ""

# openSUSE adds a host tool to scripts/mod that poky's kernel builds do not have.
#
# scripts/mod/ksym-provides.c reads the symbol table with libelf, to produce the
# "ksym(...)" RPM provides that let a module package declare which kernel ABI it
# was built against. It is compiled for the build host, not the target, so the
# headers it needs are elfutils-native's. Nothing in kernel.bbclass pulls them
# in, because no upstream kernel needs them.
DEPENDS += "elfutils-native"
