SUMMARY = "Development files for the Qt 6 3DRender library"
DESCRIPTION = "Development files for the Qt 6 3DRender library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3drender-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e4a4f9b75371fbf055a62d14754e2f5d91a5cedff2cdda05940d870b327dfb8c01e9002d9b1035e0733295a5a2bdd3ad5fd89bd0202ccd99d690c1a2fc1168d9"

RPROVIDES:${PN} += "cmake-Qt63DRender \
pkgconfig-Qt63DRender \
qt6-3drender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Concurrent \
cmake-Qt6OpenGL \
libQt63DRender6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6OpenGL"

inherit rpm
