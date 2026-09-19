SUMMARY = "Qt 6 QuickTimeline library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTimeline library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quicktimeline-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9c520f12ea95dba2ffcac93cc2f7255aa1736f1bb715745739fa74fef9ce5f79a08197789e5b796fdec52554dad58246b8fa51c29ce6f1acf33efa748895cb34"

RPROVIDES:${PN} += "cmake-Qt6QuickTimeline \
cmake-Qt6QuickTimelineBlendTrees \
pkgconfig-Qt6QuickTimeline \
pkgconfig-Qt6QuickTimelineBlendTrees \
qt6-quicktimeline-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6QuickTimeline6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6QuickTimeline"

inherit rpm
