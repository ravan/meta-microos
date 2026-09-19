SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-riscv64-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "3cfa897f63f1dcefde22ca8c7d51b1fb08da7c0c41e91e68c3c3776a024d511b3606680231b6b99d79742feb9e4aa39195759e5194e668855f84971bb5eb0698"

RPROVIDES:${PN} += "cross-riscv64-gcc16 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
cross-riscv64-glibc-devel \
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
