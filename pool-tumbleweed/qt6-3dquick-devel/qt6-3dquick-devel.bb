SUMMARY = "Development files for the Qt 6 3DQuick library"
DESCRIPTION = "Development files for the Qt 6 3DQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquick-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "230601c5351acb541aaac006ee013ee5029ed3595f0d3b4488e2b30d912d8d306f2f80854947e91d006ea7b15264c9fcf5d05229951663aacedc96937e5f4eaa"

RPROVIDES:${PN} += "cmake-Qt63DQuick \
pkgconfig-Qt63DQuick \
qt6-3dquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DCorePrivate \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt63DQuick6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
