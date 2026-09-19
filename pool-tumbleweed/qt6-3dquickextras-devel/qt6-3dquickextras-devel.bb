SUMMARY = "Development files for the Qt 6 3DQuickExtras library"
DESCRIPTION = "Development files for the Qt 6 3DQuickExtras library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickextras-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e7f9dba9434f99cb062ca255bafc8b3f7526a3c7089343e2a7d6a53131cae04822e168775ae1d563461bf2c7c286bee342625901a4ebdde667159c5fc8f29d28"

RPROVIDES:${PN} += "cmake-Qt63DQuickExtras \
pkgconfig-Qt63DQuickExtras \
qt6-3dquickextras-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DExtras \
cmake-Qt63DInput \
cmake-Qt63DLogic \
cmake-Qt63DQuick \
cmake-Qt63DRender \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickExtras6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DExtras \
pkgconfig-Qt63DInput \
pkgconfig-Qt63DLogic \
pkgconfig-Qt63DQuick \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
