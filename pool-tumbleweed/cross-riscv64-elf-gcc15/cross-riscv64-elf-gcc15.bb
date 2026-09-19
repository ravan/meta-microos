SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-riscv64-elf-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "bef031662d051885f71c251f151bbe887be679048a6fd3bf3cc299f300a4543574777abb15e0f216cc9895b4767018c519a84c6b594366edd63372567d8acbda"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc15 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
cross-riscv64-newlib-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc15 \
libz.so.1 \
libzstd.so.1"

inherit rpm
