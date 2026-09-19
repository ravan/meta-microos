SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-riscv64-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "3d6db1f17dbc1933780fa3d74d3f0fc8c103a948960c091eb89151749e53aa58963bfcb10785b19b55719ee84040991b12f90967c32b19c6f959621aa68f1bef"

RPROVIDES:${PN} += "cross-riscv64-gcc14 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
cross-riscv64-glibc-devel \
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
