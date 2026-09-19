SUMMARY = "Set of charts for QtQuick applications"
DESCRIPTION = "The Quick Charts module provides a set of charts that can be used from QtQuick \
applications. They are intended to be used for both simple display of data as \
well as continuous display of high-volume data (often referred to as plotters). \
The charts use a system called distance fields for their accelerated rendering, \
which provides ways of using the GPU for rendering 2D shapes without loss of \
quality."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kquickcharts-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "d652bbbcebf5f5ca561f6689a6c34cccaf645107c5c768cfef8a95345220814f1cad23355956a413f16b8265474ec7eaaafc64355d4e0d0f949103a7ecf0cc44"

RPROVIDES:${PN} += "kf6-kquickcharts \
libQuickCharts.so.1 \
libQuickChartsControls.so.1 \
libQuickChartsControlsplugin.so \
libQuickChartsplugin.so \
qt6qmlimport-org.kde.quickcharts \
qt6qmlimport-org.kde.quickcharts.1 \
qt6qmlimport-org.kde.quickcharts.controls \
qt6qmlimport-org.kde.quickcharts.controls.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kirigami"

inherit rpm
