SUMMARY = "Examples for the qt6-charts modules"
DESCRIPTION = "Examples for the qt6-charts modules."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-charts-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e6c1929378eefe9241481e6bf74859b16208582d11ab4adbac5e80939eefb7bb0f32ae0b62b1a0a1edfefdd11f39edcddcecfeb4f12051f270f27e1099e9105e"

RPROVIDES:${PN} += "qt6-charts-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtCharts \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Layouts"

inherit rpm
