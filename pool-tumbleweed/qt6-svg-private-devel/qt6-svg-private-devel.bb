SUMMARY = "Non-ABI stable API for the Qt 6 SVG libraries"
DESCRIPTION = "This package provides private headers of libQt6Svg that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-svg-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "44aec4c347d111786ee57aa9525b984e1add1c05f3c9fd7384fbf67e6fff6dd37259c074aa7d52a46b8aa60a46699fb0933214e4c4099c3e7ccdc263f183431b"

RPROVIDES:${PN} += "cmake-Qt6SvgPrivate \
qt6-svg-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6Svg \
cmake-Qt6SvgWidgets \
cmake-Qt6WidgetsPrivate"

inherit rpm
