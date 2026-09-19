SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql17-postgis-3.6.4-1.3.aarch64.rpm"
RPM_HASH = "8e52011ca8a27ca8519afd0471f1cf9540ac6160346cb5687af8753308a11171dd64650a679514a3fdf6e1ac9db49ab2ca69d3559aa1734cdb6e30c6d2ba42a2"

RPROVIDES:${PN} += "postgis \
postgresql17-address-standardizer \
postgresql17-postgis \
postgresql17-postgis-llvmjit"

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
postgresql17-server \
proj \
update-alternatives"

inherit rpm
