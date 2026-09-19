SUMMARY = "wlr-layer-shell integration for Qt 6 - library"
DESCRIPTION = "This allows integration of Qt applications with wlr-layer-shell."
LICENSE = "LGPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "libLayerShellQtInterface6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "c010752dc9a0f650b74cc3ec171013124b6d602c1df183ae50b40ceb0c1648805143616b7f68be0e17f7df4594e3166f56af69a0ff48ed6062eacefc8e9349d9"

RPROVIDES:${PN} += "libLayerShellQtInterface.so.6 \
libLayerShellQtInterface6"

RDEPENDS:${PN} += "/sbin/ldconfig \
layer-shell-qt6 \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
