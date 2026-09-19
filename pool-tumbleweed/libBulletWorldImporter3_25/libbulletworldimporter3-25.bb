SUMMARY = "Bullet World Importer Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "libBulletWorldImporter3_25-3.25-2.1.aarch64.rpm"
RPM_HASH = "f6befbd7b07f53e9fe6761f84cc72d1b8bd90f60f42b786af4c8c809883901a87d73ef62d28e321d4bbce63165bc2e9ca30f461eecad92029d24c2eb71188f64"

RPROVIDES:${PN} += "libBulletWorldImporter.so.3.25 \
libBulletWorldImporter3-25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.25 \
libBulletDynamics.so.3.25 \
libBulletFileLoader.so.3.25 \
libLinearMath.so.3.25 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
