SUMMARY = "GNU D Compiler"
DESCRIPTION = "This package contains a D compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-d-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "832294c2d5fda8ce6417f731056ad1c35ea78b53855e6902c2e82ce3f920a3c0210b7798ca902caaed4c05058ff79379ca9099a565e21005ea2bd778d06f9eb3"

RPROVIDES:${PN} += "gcc14-d"

RDEPENDS:${PN} += "gcc14 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdruntime5 \
libgmp.so.10 \
libgphobos5 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
