SUMMARY = "Development files for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DQuickAnimation library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquickanimation-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "cf61c4359ce81450646e57cfd73c230bf7f05fc56074ef882e18bd1c89cb47de935b09271338c70040cb1c022672e95fb533d98976a554eeae288b55a7e5a4d8"

RPROVIDES:${PN} += "cmake-Qt63DQuickAnimation \
pkgconfig-Qt63DQuickAnimation \
qt6-3dquickanimation-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DAnimation \
cmake-Qt63DCore \
cmake-Qt63DQuick \
cmake-Qt63DRender \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickAnimation6 \
pkgconfig-Qt63DAnimation \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DQuick \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
