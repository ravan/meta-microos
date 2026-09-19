SUMMARY = "Plugin to render beautiful and interactive graphs"
DESCRIPTION = "A QtQuick plugin to render beautiful and interactive graphs."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kqtquickcharts-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6477a88be875e5539882361cbf90b448ae5e8813039472311698c98ae71e3c477229ce9de62ef4d8ab8fe68b59c976e0358fa5481680954b06cc7e3949c0415a"

RPROVIDES:${PN} += "cmake-KQtQuickCharts \
kqtquickcharts \
libkqtquickcharts.so \
qt6qmlimport-org.kde.charts \
qt6qmlimport-org.kde.charts.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-org.kde.charts.0"

inherit rpm
