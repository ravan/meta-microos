SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-d-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "bc9677ecf59b2a7f4def0dfa905cbfe943d3631c598dec73901873fbb4f49a748ec993c24dcb2a2e0848d39e80052b8027222f6118f196298d1c1f1d6fd9c60e"

RPROVIDES:${PN} += "gcc13-d"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdruntime4 \
libgmp.so.10 \
libgphobos4 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
