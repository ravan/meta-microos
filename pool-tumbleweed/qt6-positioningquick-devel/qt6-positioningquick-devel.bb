SUMMARY = "Qt 6 PositioningQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-positioningquick-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e2a5e3c01ccec85229cf7880b6c1c9d6e4596a6c49d8d36e8ef44734bebada2f4b92ea4e7030be8e1bfacbb220231d8db13c7989a6477a34e89d41edf131c4aa"

RPROVIDES:${PN} += "cmake-Qt6PositioningQuick \
pkgconfig-Qt6PositioningQuick \
qt6-positioningquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Positioning \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6PositioningQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Positioning \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
