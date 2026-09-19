SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql15-postgis-3.6.4-1.3.aarch64.rpm"
RPM_HASH = "66b853e9b63d65459bea8c51dc34da31d819ef1882039dc508632db63ebc9354d68c3607f64738e2f5142bba15af2c10c92d3e50460432bf1e10bbd4e96ec16d"

RPROVIDES:${PN} += "postgis \
postgresql15-address-standardizer \
postgresql15-postgis \
postgresql15-postgis-llvmjit"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSFCGAL.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libgeos-c.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjson-c.so.5 \
libm.so.6 \
libpcre2-8.so.0 \
libpq.so.5 \
libproj.so.25 \
libprotobuf-c.so.1 \
libstdc++.so.6 \
libxml2.so.16 \
postgresql15-server \
proj \
update-alternatives"

inherit rpm
