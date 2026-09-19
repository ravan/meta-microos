SUMMARY = "Bullet Xml World Importer Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "libBulletXmlWorldImporter3_25-3.25-2.1.aarch64.rpm"
RPM_HASH = "0a020e334e37a81ebea817d68a7d8c0afef9a08a04a789534e625f5b1e7619b4d82040066ee8aaddcdeb0c3bfa85c3ace065ed434d07cd172d8da7d232dab1f5"

RPROVIDES:${PN} += "libBulletXmlWorldImporter.so.3.25 \
libBulletXmlWorldImporter3-25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBulletDynamics.so.3.25 \
libBulletWorldImporter.so.3.25 \
libLinearMath.so.3.25 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtinyxml2.so.11"

inherit rpm
