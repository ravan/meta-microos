SUMMARY = "Qt 6 DataVisualization library"
DESCRIPTION = "The Qt 6 DataVisualization library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6DataVisualization6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "6318f32144182975f3f3a31427a1a8825bc6df27432e0d8936b865e05a24bf74627822cc3289c0e8e93247e8cb3409e63c518bcbb5f322d4da8a62f19ca4ea16"

RPROVIDES:${PN} += "libQt6DataVisualization.so.6 \
libQt6DataVisualization6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
