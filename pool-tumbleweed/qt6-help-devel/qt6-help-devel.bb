SUMMARY = "Qt 6 Help library - Development files"
DESCRIPTION = "Development files for the Qt6 Help library."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-help-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "675a0882c861e4ce0895aa6d5d3d0ab1a876180440fdb7514ba0877a10bd8c00462b83bc826b07463af75b7d9d9884b6ae571ed261e1a784c17bc148319096db"

RPROVIDES:${PN} += "cmake-Qt6Help \
pkgconfig-Qt6Help \
qt6-help-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Sql \
cmake-Qt6Tools \
cmake-Qt6Widgets \
libQt6Help6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Sql \
pkgconfig-Qt6Widgets"

inherit rpm
