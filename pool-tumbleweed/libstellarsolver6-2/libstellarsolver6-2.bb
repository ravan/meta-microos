SUMMARY = "Astrometric Solver runtime library"
DESCRIPTION = "An Astrometric Plate Solver for Mac, Linux, and Windows, \
built on Astrometry.net and SEP (sextractor), runtime library."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "libstellarsolver6-2-2.8-1.3.aarch64.rpm"
RPM_HASH = "acf13125f41fc79675894abef53a37de7b10d40b41d228bc817364fdb63a80b344623059c261b9ed913dfeb2ac1a7ea8d4ec1489123cc3a8fd58e3e8f728fcf3"

RPROVIDES:${PN} += "libstellarsolver6-2 \
libstellarsolver6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwcs.so.8"

inherit rpm
