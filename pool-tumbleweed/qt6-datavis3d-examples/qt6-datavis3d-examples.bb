SUMMARY = "Examples for the qt6-datavis3d modules"
DESCRIPTION = "Examples for the qt6-datavis3d modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-datavis3d-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e14bc69874a3c8c2e9bfe9be825167bf47cc624c818854e0c0b50c8c48f90daff99943648c298ffeca3ce96100e3d14e2970c656f8282360c396b5e3a5ec63ec"

RPROVIDES:${PN} += "qt6-datavis3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.qmlmodels \
qt6qmlimport-QtDataVisualization \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts"

inherit rpm
