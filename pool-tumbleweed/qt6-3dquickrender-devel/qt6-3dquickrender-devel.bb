SUMMARY = "Development files for the Qt 6 3DQuickRender library"
DESCRIPTION = "Development files for the Qt 6 3DQuickRender library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickrender-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d5bc622d5e038e29dad954d07f99957bcf8e2ebcad689d6aa65031f097d2e7ef16d7b119c67ccd4aee3c375d4df45b5411b18f17f64ed651bbde4d79209364a5"

RPROVIDES:${PN} += "cmake-Qt63DQuickRender \
pkgconfig-Qt63DQuickRender \
qt6-3dquickrender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DQuick \
cmake-Qt63DRender \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickRender6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DQuick \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
