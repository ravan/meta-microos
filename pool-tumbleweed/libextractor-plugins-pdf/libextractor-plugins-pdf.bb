SUMMARY = "The 'pdf' libextractor plugin"
DESCRIPTION = "This package ships the 'pdf' plugin for libextractor."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.14"

RPM_NAME = "libextractor-plugins-pdf-1.14-1.2.aarch64.rpm"
RPM_HASH = "2c2e6f9d0da7303f12a11137ab1444430ef39691faa988f868f50e6b132ab9650e260ca44bf576858dfc6a608737b7c5a877e63779f504d3ec4f00d504bc557b"

RPROVIDES:${PN} += "libextractor-pdf.so \
libextractor-plugins-pdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-cpp.so.3 \
libstdc++.so.6"

inherit rpm
