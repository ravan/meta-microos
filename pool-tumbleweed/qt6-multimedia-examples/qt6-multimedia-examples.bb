SUMMARY = "Examples for the qt6-multimedia modules"
DESCRIPTION = "Examples for the qt6-multimedia modules."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-multimedia-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "705007e57751e44b8b1cac81f8c30d044b812bce4aa03ed05e512036ec49df55793e65d72693ecab74800ba1601cc2d436229872daddbb11b1035a981a76c920"

RPROVIDES:${PN} += "qt6-multimedia-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6SpatialAudio.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtCore \
qt6qmlimport-QtMultimedia \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Material \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window"

inherit rpm
