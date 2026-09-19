SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-riscv64-elf-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "e1d772c236ebfd013a2025d76d3db7a0eb056b3728439f4580046164e8527ace875fa9395c46d9c2c86a1bb02c4dcdad534f0ea942e1b35877c58cd1641818dc"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13 \
riscv64-elf-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
cross-riscv64-newlib-devel \
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
