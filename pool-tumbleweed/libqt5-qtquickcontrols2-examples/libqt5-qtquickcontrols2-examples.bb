SUMMARY = "Qt5 quickcontrols2 examples"
DESCRIPTION = "Examples for libqt5-qtquickcontrols2 module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde5"

RPM_NAME = "libqt5-qtquickcontrols2-examples-5.15.19+kde5-1.2.aarch64.rpm"
RPM_HASH = "6ffca9c644b281ec92a40372f374ffc8f8e302488c0afe690f4593309a5f8eb9e1cc2599851c5c17265a52fb7f62203f761f84c27fc8c99e20320da2eb707b38"

RPROVIDES:${PN} += "libqt5-qtquickcontrols2-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Imagine.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Controls.Universal.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
