SUMMARY = "Qt 6 Charts QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Charts module."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-charts-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a09f91b7f87d1f5daef5b0b5b7fc3ae1ccb03c136fcb42c345991f516e36e25e7a194ce034162714667360b413736e3544cff19a6d722600cef91ced10bfe40a"

RPROVIDES:${PN} += "libqtchartsqml2plugin.so \
qt6-charts-imports \
qt6qmlimport-QtCharts \
qt6qmlimport-QtCharts.1 \
qt6qmlimport-QtCharts.2 \
qt6qmlimport-QtCharts.6"

RDEPENDS:${PN} += "libQt6ChartsQml.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
