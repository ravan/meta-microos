SUMMARY = "Qt 6 DataVisualization QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 DataVisualization module."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-datavisualization-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6dc81711c119982c44dcad60b9dd76af69216bf44d5a4aa24103ba90af0fa2c7ddd9b140ea77646dac6614ad11bf8353bd9e2cf5a421125ec95766bdf7488e3d"

RPROVIDES:${PN} += "libdatavisualizationqmlplugin.so \
qt6-datavisualization-imports \
qt6qmlimport-QtDataVisualization \
qt6qmlimport-QtDataVisualization.1 \
qt6qmlimport-QtDataVisualization.2 \
qt6qmlimport-QtDataVisualization.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6DataVisualizationQml.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
