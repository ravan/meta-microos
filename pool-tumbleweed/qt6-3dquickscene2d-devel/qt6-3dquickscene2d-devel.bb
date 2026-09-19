SUMMARY = "Development files for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "Development files for the Qt 6 3DQuickScene2D library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickscene2d-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5f7bc04c17a53eab48dde02461a145038df22b746c16eae0e07c8746004644371dd8c799ccf96f353bc2a91ceea20a9dcbde1c23ce39fdaf81bf5cc3c9184293"

RPROVIDES:${PN} += "cmake-Qt63DQuickScene2D \
pkgconfig-Qt63DQuickScene2D \
qt6-3dquickscene2d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DQuick \
cmake-Qt63DRender \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickScene2D6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DQuick \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
