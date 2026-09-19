SUMMARY = "Qt5 location examples"
DESCRIPTION = "Examples for libqt5-qtlocation module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde7"

RPM_NAME = "libqt5-qtlocation-examples-5.15.19+kde7-1.2.aarch64.rpm"
RPM_HASH = "6e5360c57e85ba69fe19915e1e2530a813e9a3a145008cfd2d32e6385550a00f35c2d23662acf78ee9ec5d9bbf68a7464d4b4e96c2877224787e8ccba4a9b929"

RPROVIDES:${PN} += "libqt5-qtlocation-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Location.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.location.1 \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-Qt.labs.qmlmodels.1 \
qt5qmlimport-QtLocation.5 \
qt5qmlimport-QtPositioning.5 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Shapes.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
