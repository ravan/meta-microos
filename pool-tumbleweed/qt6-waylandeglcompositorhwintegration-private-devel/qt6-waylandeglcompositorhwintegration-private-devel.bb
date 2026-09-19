SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-waylandeglcompositorhwintegration-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "91f3b278d8996faa04ef7c7ffab1f5400bb7453e7981ea0c0bc2e6cd91fbce86f3e24a0e7ef4c06cee2b692b2fdf0b41439d3ea736d51079636b51fa4daa2d96"

RPROVIDES:${PN} += "cmake-Qt6WaylandEglCompositorHwIntegrationPrivate \
qt6-waylandeglcompositorhwintegration-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
cmake-Qt6WaylandCompositorPrivate \
libQt6WaylandEglCompositorHwIntegration6"

inherit rpm
