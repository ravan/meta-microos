SUMMARY = "Bullet Continuous Collision Detection and Physics Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "libbullet3_25-3.25-2.1.aarch64.rpm"
RPM_HASH = "adaa00f2ba33817eb026a264b98d1264ac4a412d9aa5a202e14f0a5bbec8298e17a28bf1f3bb47a5b1ba3f687858a01673d2b25ea53c0f1896949f3393a86877"

RPROVIDES:${PN} += "libBullet2FileLoader.so.3.25 \
libBullet3Collision.so.3.25 \
libBullet3Common.so.3.25 \
libBullet3Dynamics.so.3.25 \
libBullet3Geometry.so.3.25 \
libBullet3OpenCL-clew.so.3.25 \
libBulletCollision.so.3.25 \
libBulletDynamics.so.3.25 \
libBulletInverseDynamics.so.3.25 \
libBulletRobotics.so.3.25 \
libBulletRoboticsGUI.so.3.25 \
libBulletSoftBody.so.3.25 \
libLinearMath.so.3.25 \
libbullet \
libbullet3-25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBulletExampleBrowserLib.so.3.25 \
libBulletFileLoader.so.3.25 \
libBulletInverseDynamicsUtils.so.3.25 \
libBulletWorldImporter.so.3.25 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml2.so.11"

inherit rpm
