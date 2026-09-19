SUMMARY = "Qt 6 WaylandEglCompositorHwIntegration library"
DESCRIPTION = "The Qt 6 WaylandEglCompositorHwIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6WaylandEglCompositorHwIntegration6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "fc0ed6f59c326acf1bcf43dd7fdd87a7f8823c2117ac5466651170980b9d61fbcc9185664070483a1772c192b9047c4bdc8d5a621a71f64d30f0c0a9327ff06b"

RPROVIDES:${PN} += "libQt6WaylandEglCompositorHwIntegration.so.6 \
libQt6WaylandEglCompositorHwIntegration6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6WaylandCompositor.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-server.so.0"

inherit rpm
