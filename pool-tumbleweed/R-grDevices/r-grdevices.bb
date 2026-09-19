SUMMARY = "Package providing R-core graphics devices in R-grDevices"
DESCRIPTION = "This package provides R-grDevices, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-grDevices-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "6130d3ecd7e119d7a898a210d2ff6ba091bd13826e96ef64ddab8ead66afc3d2d5da0250c886654569adc6693296428eb570f41ddcb987ed80c37a4ba771263c"

RPROVIDES:${PN} += "R-grDevices"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libtiff.so.6 \
libz.so.1"

inherit rpm
