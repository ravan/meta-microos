SUMMARY = "Development files for the Qt 6 3DQuickInput library"
DESCRIPTION = "Development files for the Qt 6 3DQuickInput library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickinput-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b2dcb68b381ee7d408932d8823e884f8d77de058b89e0c7f9b70985ac5d2e4a4bdbf6fbfb546e2e81bd1f52f902612f551d77457bd3ca79e7a466d54e0befe01"

RPROVIDES:${PN} += "cmake-Qt63DQuickInput \
pkgconfig-Qt63DQuickInput \
qt6-3dquickinput-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DInput \
cmake-Qt63DQuick \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickInput6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DInput \
pkgconfig-Qt63DQuick \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
