SUMMARY = "Scene-graph based retain-mode 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97."
LICENSE = "GPL-2.0-only"

PV = "3.1.3"

RPM_NAME = "libCoin60-3.1.3-7.11.aarch64.rpm"
RPM_HASH = "2977e1359d9e0d852d86eaeccbc05894e2070262772e20f3c565c428016f8e8c07cba56269303532b1d9995c75f837754409c9b37204c740c7b0a092dbc58e7b"

RPROVIDES:${PN} += "Coin \
libCoin.so.60 \
libCoin60"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
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
