SUMMARY = "Mapsserver library for mapserver or mapscript module"
DESCRIPTION = "Mapserver library for mapserver or mapscript module. you need this lib to run mapserver \
or any of the mapscript module (php, java, python, ruby)"
LICENSE = "MIT"

PV = "8.6.6"

RPM_NAME = "libmapserver2-8.6.6-1.1.aarch64.rpm"
RPM_HASH = "9e73ee296aa3d044ea1671c15656b310edd765883b3cface60e509fa2e90228d1ed14266770437d16c4b022b948bb2d2b8ea09bcbc2cb88378a2f68a2feacc3c"

RPROVIDES:${PN} += "libmapserver.so.2 \
libmapserver2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libexslt.so.0 \
libfreetype.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgdal.so.39 \
libgeos-c.so.1 \
libgif.so.7 \
libharfbuzz.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpcre2-posix.so.3 \
libpng16.so.16 \
libpq.so.5 \
libproj.so.25 \
libprotobuf-c.so.1 \
libstdc++.so.6 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
