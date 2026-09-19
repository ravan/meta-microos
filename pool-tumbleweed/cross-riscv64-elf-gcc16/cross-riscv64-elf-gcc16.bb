SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-riscv64-elf-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "75ff653208674d7c714b2fa7d579a14924dd70d96b6a5490cac0903532ab0329d8126b9e9858c7139d9729f2bbb5abafe0ff0fe7291abaf3233f54694fe789a2"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc16 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
cross-riscv64-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
