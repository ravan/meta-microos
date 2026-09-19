SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-riscv64-elf-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "619801c928abe52616194873c0ed418e0c5aa02e34d0f71cc6681ae247f047741746807b4ce5132b2480eb6d025428693715e0d645e0c5c173088ab8db10b12e"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc14 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
cross-riscv64-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc14 \
libz.so.1 \
libzstd.so.1"

inherit rpm
