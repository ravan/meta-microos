SUMMARY = "wlr-layer-shell integration for Qt"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "layer-shell-qt6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "39ff00a305f8b1404efbb812a6d27dbbc5fce0b8ed0c0fba4942ce7e86e0b90cd0fb7b5d3ff67d8607225224416b50b874aacf3d72e44a3546ca6c7ce63ede2a"

RPROVIDES:${PN} += "layer-shell-qt6 \
liblayer-shell.so"

RDEPENDS:${PN} += "libLayerShellQtInterface.so.6 \
libQt6Core.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
