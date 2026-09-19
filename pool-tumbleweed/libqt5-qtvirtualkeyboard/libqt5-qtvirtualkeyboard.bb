SUMMARY = "Qt 5 Virtual Keyboard"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains a virtual keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "7cdaf63c56205abcefcf152c18749d68b02ce5b51287781f55e4e73c9329e19dc3a9c003d4ade5f406f39fa03094f6a5f97ba157a125e7b6623f22e0eeb1ef76"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard \
libqtquickvirtualkeyboardplugin.so \
libqtquickvirtualkeyboardsettingsplugin.so \
libqtquickvirtualkeyboardstylesplugin.so \
libqtvirtualkeyboardplugin.so \
qt5qmlimport-QtQuick.VirtualKeyboard.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.2 \
qt5qmlimport-QtQuick.VirtualKeyboard.Settings.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.Settings.2 \
qt5qmlimport-QtQuick.VirtualKeyboard.Styles.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.Styles.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Svg.so.5 \
libQt5VirtualKeyboard.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.folderlistmodel.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.Settings.2 \
qt5qmlimport-QtQuick.VirtualKeyboard.Styles.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
