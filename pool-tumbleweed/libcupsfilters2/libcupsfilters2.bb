SUMMARY = "The actual libcupsfilters 2.x version library"
DESCRIPTION = "This package provides the libcupsfilters 2.x version library."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "libcupsfilters2-2.1.1-2.1.aarch64.rpm"
RPM_HASH = "dcda0eadb053c374fc16ad310079d2dadda57aa31f738dcec36e18dbc3634096952ce93aa04723baf0e4cf35dccd2bbec000c1e6562775a8076a4c20392bb298"

RPROVIDES:${PN} += "libcupsfilters.so.2 \
libcupsfilters2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libexif.so.12 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libpoppler-cpp.so.3 \
libqpdf.so.30 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
