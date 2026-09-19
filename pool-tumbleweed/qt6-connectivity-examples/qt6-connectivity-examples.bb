SUMMARY = "Examples for the qt6-connectivity modules"
DESCRIPTION = "Examples for the qt6-connectivity modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-connectivity-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "77ceae8de30a3288b696889d5885104a8a225f2140643a182bc3e7941e9801e5b4e0d9818f1fad0caadc5a242469f53e8f0296bc6f119449104c4af54edf9428"

RPROVIDES:${PN} += "qt6-connectivity-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Bluetooth.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Nfc.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtCore \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window"

inherit rpm
