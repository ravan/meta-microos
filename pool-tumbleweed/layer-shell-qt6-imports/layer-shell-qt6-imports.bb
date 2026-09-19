SUMMARY = "wlr-layer-shell integration for Qt 6 - QtQuick support"
DESCRIPTION = "This package provides a QML plugin and QtQuick components for \
layer-shell-qt6, a library for integration of Qt applications with \
wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "layer-shell-qt6-imports-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "429170fb4e23b6093a0a43c0b520b47f798e3198e6ec76465d6213d5ac6e2b9f5f15bf78e6e627bb8c1225f298fad1e625da3afccfd2605d587a2dda0bc24a87"

RPROVIDES:${PN} += "layer-shell-qt6-imports \
libLayerShellQtQml.so \
qt6qmlimport-org.kde.layershell \
qt6qmlimport-org.kde.layershell.1"

RDEPENDS:${PN} += "layer-shell-qt6 \
ld-linux-aarch64.so.1 \
libLayerShellQtInterface.so.6 \
libLayerShellQtInterface6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
