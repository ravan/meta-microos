SUMMARY = "Scene-graph based retain-mode 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97."
LICENSE = "BSD-3-Clause"

PV = "4.0.3"

RPM_NAME = "libCoin80-4.0.3-2.4.aarch64.rpm"
RPM_HASH = "6b982c4d11e202d9d44032da7a50448554396afab72e44066a598d08786bea5c30ad904c16d9523794472bb419f19fdf78d08a917d1e63146b6f97eab3f624f8"

RPROVIDES:${PN} += "libCoin.so.80 \
libCoin80"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
libbz2.so.1 \
libc.so.6 \
libexpat.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
