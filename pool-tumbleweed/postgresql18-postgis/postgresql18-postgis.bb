SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql18-postgis-3.6.4-1.3.aarch64.rpm"
RPM_HASH = "81754beae648f4a3d5f45377a9feceb011f837f356207a84c85f7d73f4d3c78d346cbee139a9e989c920b92351866d8fa7525fb386bf8d5cb04e4dd916e2d1c1"

RPROVIDES:${PN} += "postgis \
postgresql18-address-standardizer \
postgresql18-postgis \
postgresql18-postgis-llvmjit"

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
postgresql18-server \
proj \
update-alternatives"

inherit rpm
