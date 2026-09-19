SUMMARY = "Bullet Inverse Dynamics Utils Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "libBulletInverseDynamicsUtils3_25-3.25-2.1.aarch64.rpm"
RPM_HASH = "4516496ad8a878b2e40f2fb0cebc8858e3ba823de5dcebcf8c8a2b344aa9d74c54af725994283668197509a188137bc7bf48060ebfad43b7218cba0f53c32bd6"

RPROVIDES:${PN} += "libBulletInverseDynamicsUtils.so.3.25 \
libBulletInverseDynamicsUtils3-25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBullet3Common.so.3.25 \
libBulletCollision.so.3.25 \
libBulletDynamics.so.3.25 \
libBulletInverseDynamics.so.3.25 \
libLinearMath.so.3.25 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
