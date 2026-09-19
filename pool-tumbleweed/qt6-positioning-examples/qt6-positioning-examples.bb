SUMMARY = "Examples for the qt6-positioning module"
DESCRIPTION = "Examples for the qt6-positioning module."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-positioning-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a0c02c031b14f53b0cac4370132c4f844b575e2efde12911e98e7b9d857abb9b94b907306253c9cbb1bce7c9f42a1ce129e977147c66301aef867d0a86388945"

RPROVIDES:${PN} += "qt6-location-examples \
qt6-positioning-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtCore \
qt6qmlimport-QtPositioning \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls.Basic \
qt6qmlimport-QtQuick.Effects \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Shapes \
qt6qmlimport-QtQuick.Window"

inherit rpm
