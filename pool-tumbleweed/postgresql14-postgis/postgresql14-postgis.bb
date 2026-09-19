SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql14-postgis-3.6.4-1.3.aarch64.rpm"
RPM_HASH = "60ee04aabeec6c4364bf6f6d354473bcd633bc7caa9d426e4a7924ac2df6a715699b454bf1e954a404e6ffbed8d0dce872413e1e20826cffe3d89df3b28a4189"

RPROVIDES:${PN} += "postgis \
postgresql14-address-standardizer \
postgresql14-postgis \
postgresql14-postgis-llvmjit"

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
postgresql14-server \
proj \
update-alternatives"

inherit rpm
