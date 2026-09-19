SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql16-postgis-3.6.4-1.3.aarch64.rpm"
RPM_HASH = "2eb2b9d579b420b75e78d293fcd1ad3797ad164508361be2797881a6f9eb3eb2e7972d8f4ac7931762f48a25d37680dca3ad9ae54cc61ed2c25b13b9bce606a8"

RPROVIDES:${PN} += "postgis \
postgresql16-address-standardizer \
postgresql16-postgis \
postgresql16-postgis-llvmjit"

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
postgresql16-server \
proj \
update-alternatives"

inherit rpm
