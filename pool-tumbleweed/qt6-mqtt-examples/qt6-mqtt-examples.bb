SUMMARY = "Examples for the qt6-mqtt modules"
DESCRIPTION = "Examples for the qt6-mqtt modules."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-mqtt-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "953bab71284fc57b4a5916b8fe04b9e8066658d91763179600fe39cf3b4698c4b86c97fc3f70ba465878f96c5a0a9a2aa3909854440f1b4e804d1f84a7c0cc86"

RPROVIDES:${PN} += "qt6-mqtt-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Mqtt.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window"

inherit rpm
