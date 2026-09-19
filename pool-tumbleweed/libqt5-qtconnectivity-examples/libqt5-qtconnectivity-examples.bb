SUMMARY = "Qt5 location examples"
DESCRIPTION = "Examples for libqt5-qtconnectivity module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtconnectivity-examples-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "0a3c256999a346a060b6668d21e71eef1d51406dfeac304c3742f8bf597bf534d3805228e0aed099f70f4b6b16fdcaca17e2f78bfd4f966a167340522cac84bd"

RPROVIDES:${PN} += "libqt5-qtconnectivity-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Bluetooth.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Nfc.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.folderlistmodel.1 \
qt5qmlimport-QtBluetooth.5 \
qt5qmlimport-QtNfc.5 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
