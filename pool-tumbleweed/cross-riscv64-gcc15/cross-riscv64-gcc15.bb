SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-riscv64-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "97cc8a052da75c207e4ae4b2b0234ec5fc1ea7e13e7b1370fc1897d579884550c55ff4eae09758f1fa6e1831716839aa7d873cd22ba6fa45beadf4c39f777362"

RPROVIDES:${PN} += "cross-riscv64-gcc15 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
cross-riscv64-glibc-devel \
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
