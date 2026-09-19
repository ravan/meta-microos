SUMMARY = "Examples for the qt6-canvaspainter modules"
DESCRIPTION = "Examples for the qt6-canvaspainter modules."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-canvaspainter-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b0689f210e7e464a80633b2dbc1c13e99e0dd59683bb22ca3daa4fbef6697c657888823a8b4e885579e09ad39aa347265876c00b22f967f6dcc0444abc548dac"

RPROVIDES:${PN} += "qt6-canvaspainter-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6CanvasPainter.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Window"

inherit rpm
