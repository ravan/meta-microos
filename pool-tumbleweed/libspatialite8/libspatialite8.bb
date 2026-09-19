SUMMARY = "Spatial SQLite"
DESCRIPTION = "The SpatiaLite extension enables SQLite to support spatial data too \
[aka GEOMETRY], in a way conformant to OpenGis specifications."
LICENSE = "MPL-1.1"

PV = "5.1.0"

RPM_NAME = "libspatialite8-5.1.0-1.14.aarch64.rpm"
RPM_HASH = "fda9bae1deb42a1af695a94433b67c391ed912fe36bdd2e2b0dd23e5dbd7d919fa3dd6d0ae163a3c656f1a637e84e0ec5152c799ffc1080ce8338068fccd9a28"

RPROVIDES:${PN} += "libspatialite.so.8 \
libspatialite8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreexl.so.1 \
libgeos-c.so.1 \
libm.so.6 \
libminizip.so.1 \
libproj.so.25 \
librttopo.so.1 \
libsqlite3.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
