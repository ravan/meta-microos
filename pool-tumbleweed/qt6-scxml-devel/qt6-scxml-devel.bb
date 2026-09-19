SUMMARY = "Qt 6 Scxml library - Development files"
DESCRIPTION = "Development files for the Qt 6 Scxml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-scxml-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "10ff89807dcccdbb90926c023ad28ba44d7d02b3aac505d41f69920f58733f2cc8e8324f0cb0ec216f10656cdbc0a788359a5b72fa8947d288b329264814e674"

RPROVIDES:${PN} += "cmake-Qt6Scxml \
cmake-Qt6ScxmlGlobalPrivate \
cmake-Qt6ScxmlTools \
pkgconfig-Qt6Scxml \
qt6-scxml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6Scxml6 \
pkgconfig-Qt6Core \
qt6-scxml"

inherit rpm
