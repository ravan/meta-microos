SUMMARY = "OpenGL 2.0 and ES 2.0 benchmark"
DESCRIPTION = "A benchmark for OpenGL (ES) 2.0 that uses only the OpenGL ES 2.0 compatible \
API. It contains tests for standard OpenGL (ES) 2.0 features, such as vertex \
arrays, VBOs, texturing and shaders."
LICENSE = "GPL-3.0-only"

PV = "20250929"

RPM_NAME = "glmark2-20250929-1.3.aarch64.rpm"
RPM_HASH = "1622106d0e5dc202fa548a85e6401bbd2dcee03d2c4e12dd3b395cc0a3e71fb6bbf8fa3a2f4b7ed85ea77a382bf7871e37d451b89560368a8c73e636b0bbf5d2"

RPROVIDES:${PN} += "glmark2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1"

inherit rpm
