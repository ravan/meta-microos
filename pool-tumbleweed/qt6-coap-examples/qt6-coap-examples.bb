SUMMARY = "Examples for the qt6-coap modules"
DESCRIPTION = "Examples for the qt6-coap modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-coap-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "32aeac44003cbbe32feb88833c0016f4647244dbf7d82ba97e583d15306ba2a2a6c105cfb97634287a1bc96101a77bbc7bdee86ae5b1412d7a6d008c3f9fd5bb"

RPROVIDES:${PN} += "qt6-coap-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Coap.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtCore \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window"

inherit rpm
