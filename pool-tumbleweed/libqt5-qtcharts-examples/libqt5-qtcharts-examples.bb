SUMMARY = "Example programs for the Qt 5 Charts Library"
DESCRIPTION = "Examples for Qt5 Charts module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtcharts-examples-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "5824c474b4708fa75b867b591a8dbf65187ddf9893bdab8c65ae91730740cb752651344f09e7dcb4699de1c03ba3d4fb1e14b48ea5774069111f9b1aad933e25"

RPROVIDES:${PN} += "libqt5-qtcharts-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Charts5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtCharts.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.XmlListModel.2"

inherit rpm
