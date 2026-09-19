SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-d-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "ff2d307f6819e4f2ca9061551c61211da811e38bf6d7945ae05ac4c57046f3bc95a2a4bc34ea51de9b9d86b5e23af2acc5933562cac2600f5a89afebf2798533"

RPROVIDES:${PN} += "gcc15-d"

RDEPENDS:${PN} += "gcc15 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdruntime6 \
libgmp.so.10 \
libgphobos6 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
