SUMMARY = "Qt 6 SVG libraries - Development files"
DESCRIPTION = "Development files for the Qt 6 SVG libraries."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-svg-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "cf284f5f2c59f3fe69f9dcae1bfae509c26c07b290841299fb1dce3cb8cf97cdbdae0e0864045cabf84c723bdbb0fe9839a9b57026fc901353132a205264d070"

RPROVIDES:${PN} += "cmake-Qt6Svg \
cmake-Qt6SvgWidgets \
pkgconfig-Qt6Svg \
pkgconfig-Qt6SvgWidgets \
qt6-svg-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Widgets \
libQt6Svg6 \
libQt6SvgWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Svg \
pkgconfig-Qt6Widgets"

inherit rpm
