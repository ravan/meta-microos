SUMMARY = "Python bindings for the Bullet Physics library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library. \
 \
This package provides Python 3 bindings (pybullet) for the Bullet \
physics simulation library, including support for robotics simulation, \
rigid body dynamics, and soft body simulation."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "python3-pybullet-3.25-2.1.aarch64.rpm"
RPM_HASH = "198f5e1b61bab235adbc80519dccfafd65aaa229cd045c1a59a21eedaa369f9773ac37092bbf54d083646d075aadbfaef89cc92c3ea4cb806b5e4ef364376beb"

RPROVIDES:${PN} += "libBulletExampleBrowserLib.so.3.25 \
libBussIK.so \
libOpenGLWindow.so \
libgwen.so \
python3-pybullet"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBullet3Common.so.3.25 \
libBulletCollision.so.3.25 \
libBulletDynamics.so.3.25 \
libBulletFileLoader3-25 \
libBulletRobotics.so.3.25 \
libBulletRoboticsGUI.so.3.25 \
libBulletWorldImporter3-25 \
libLinearMath.so.3.25 \
libbullet3-25 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
