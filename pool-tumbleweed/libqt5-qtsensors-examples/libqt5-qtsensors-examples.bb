SUMMARY = "Qt5 sensors examples"
DESCRIPTION = "Examples for libqt5-qtsensors module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtsensors-examples-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "abea5ff1e4f6d3e8dc0c31a73e8c9a15a89f289bcb32e5fe4272294acd01350603b2c2c89a3f023b9898978f7d1c018246e16e46c0f945631fb2b5d7125b1d35"

RPROVIDES:${PN} += "libdeclarative-explorer.so \
libdeclarative-grue.so \
libgruesensor.so.1 \
libqt5-qtsensors-examples \
libqtsensors-grue.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sensors.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtSensors.5"

inherit rpm
