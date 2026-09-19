SUMMARY = "Qt5 WebEngine examples"
DESCRIPTION = "Examples for the libqt5-qtwebengine module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtwebengine-examples-5.15.19-3.3.aarch64.rpm"
RPM_HASH = "0860cee0403cf8b22af98f77e12410de6ec5282bcbc6d22339ade6c08cd2fcc8438a5ef2783a39432e23268db144f4e47cb3fbd0d44d5d0b79e6d9fb92ecfa4f"

RPROVIDES:${PN} += "libqt5-qtwebengine-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtWebEngine.1"

inherit rpm
