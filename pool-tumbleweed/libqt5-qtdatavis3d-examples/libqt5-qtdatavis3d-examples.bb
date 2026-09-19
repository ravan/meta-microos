SUMMARY = "Examples for the Qt5 Data Visualization module"
DESCRIPTION = "This package provides examples for Qt 5 Data Visualization module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtdatavis3d-examples-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "0ffccdc30d8a9402fe1c93a45f9eea1f36c3d14cf4749dbc9ff4a30aa0c263848c184ede84ae79b8513fd0c7b85ec9d1b706cfd6be5826ff232e2bf458ef06cc"

RPROVIDES:${PN} += "libqt5-qtdatavis3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtDataVisualization.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
