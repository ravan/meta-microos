SUMMARY = "Qt 6 QuickWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickWidgets library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickwidgets-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "989d21bc30473f60566147976226933a28bc65bd4b30a20fd50b7ba550b4d8e81297b0fd96d27cb88462fea258d2d20e5121b1e921da72a9915f263216b04481"

RPROVIDES:${PN} += "cmake-Qt6QuickWidgets \
pkgconfig-Qt6QuickWidgets \
qt6-quickwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Widgets \
libQt6QuickWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Widgets"

inherit rpm
