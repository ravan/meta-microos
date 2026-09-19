# gcc-cross asks for virtual/<prefix>libc-for-gcc while it configures. In the
# microos-sysroot toolchain mode that role is filled by openSUSE's signed
# glibc-devel RPM instead of a glibc Yocto built itself.
PROVIDES:append:microos-sysroot = " virtual/${TARGET_PREFIX}libc-for-gcc"
