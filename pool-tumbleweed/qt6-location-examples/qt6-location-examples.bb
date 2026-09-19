SUMMARY = "Examples for the qt6-location modules"
DESCRIPTION = "Examples for the qt6-location modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-location-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b2bbb237f23c120ddb9a6bb7c10f182065d43fccd493fd41a232ad2701e8350c9d322fc710ca80051deab12981999cd72bfed6d045ed48cd11f44afa54d213e6"

RPROVIDES:${PN} += "qt6-location-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtCore \
qt6qmlimport-QtLocation \
qt6qmlimport-QtPositioning \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Shapes \
qt6qmlimport-QtQuick.Window"

inherit rpm
