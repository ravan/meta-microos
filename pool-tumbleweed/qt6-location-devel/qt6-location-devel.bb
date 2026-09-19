SUMMARY = "Qt 6 Location library - Development files"
DESCRIPTION = "Development files for the Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-location-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0fd8297f680361d9055b0bf99c49f572bc9bffaaa1c595dbd092d1e12fc1eb2be3a135d5aad68dba4be3a7f66631450a46a0c2112f92f09e902f4a2111c3142a"

RPROVIDES:${PN} += "cmake-Qt6Location \
pkgconfig-Qt6Location \
qt6-location-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Positioning \
cmake-Qt6PositioningQuick \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickShapesPrivate \
libQt6Location6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Positioning \
pkgconfig-Qt6PositioningQuick"

inherit rpm
