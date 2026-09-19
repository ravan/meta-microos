SUMMARY = "Examples for the qt6-graphs modules"
DESCRIPTION = "Examples for the qt6-graphs modules."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-graphs-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8658a374135058b439a83b0cbab5c7170b4e0bc101159dbda1d8e9ad16264cc50aacd44f6306b7ee42eaff1b422a5f2050506c3d7231b13978ed2ed8b0500ef0"

RPROVIDES:${PN} += "qt6-graphs-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Graphs.so.6 \
libQt6GraphsWidgets.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.qmlmodels \
qt6qmlimport-QtCore \
qt6qmlimport-QtGraphs \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Basic \
qt6qmlimport-QtQuick.Controls.Fusion \
qt6qmlimport-QtQuick.Controls.Universal \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Shapes \
qt6qmlimport-QtQuick3D \
qt6qmlimport-QtQuick3D.Helpers"

inherit rpm
