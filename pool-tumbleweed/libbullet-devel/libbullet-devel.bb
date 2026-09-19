SUMMARY = "Development package for bullet library"
DESCRIPTION = "This package contain all that is needed to developer or compile \
appliancation with the Bullet library."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "libbullet-devel-3.25-2.1.aarch64.rpm"
RPM_HASH = "98328f230de47a17afb8500e6883c2187e518bec2580db54707afede92f7e907d3d3560ee7bda539fb357fa043affe0815761078f3cc5aa628c85b561cc5050d"

RPROVIDES:${PN} += "cmake-Bullet \
libbullet-devel \
pkgconfig-bullet \
pkgconfig-bullet-robotics \
pkgconfig-bullet-robotics-gui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libBulletFileLoader3-25 \
libBulletInverseDynamicsUtils3-25 \
libBulletWorldImporter3-25 \
libBulletXmlWorldImporter3-25 \
libConvexDecomposition3-25 \
libGIMPACTUtils3-25 \
libHACD3-25 \
libbullet3-25 \
pkgconfig-bullet"

inherit rpm
