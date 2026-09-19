SUMMARY = "Development files for the Qt 6 3DExtras library"
DESCRIPTION = "Development files for the Qt 6 3DExtras library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dextras-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9616806fd2801a4cb51ffb54f48e81ec055cf101640f298698e283fdc4ece31aa400bf62c984d61658e7f2881715e91d68ba1ff926313560db68a7b033254a14"

RPROVIDES:${PN} += "cmake-Qt63DExtras \
pkgconfig-Qt63DExtras \
qt6-3dextras-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DInput \
cmake-Qt63DLogic \
cmake-Qt63DRender \
cmake-Qt6Gui \
libQt63DExtras6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DInput \
pkgconfig-Qt63DLogic \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
