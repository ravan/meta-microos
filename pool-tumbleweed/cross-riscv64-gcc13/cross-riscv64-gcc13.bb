SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-riscv64-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "e853787b35c2955bffae79f247a5f4a93794fae20a5694348df340f2bb26c366de4f0e59dd89268be65a8f9d01f54beb6f2e0d82e37339eb4ef5194c514ec54c"

RPROVIDES:${PN} += "cross-riscv64-gcc13 \
riscv64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
cross-riscv64-glibc-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
