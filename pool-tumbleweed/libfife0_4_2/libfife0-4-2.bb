SUMMARY = "The Flexible Isometric Free Engine, a 2D game engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "libfife0_4_2-0.4.2-10.10.aarch64.rpm"
RPM_HASH = "99cd376410b9a3074614fc5cb1caec72a33cd3ad7b5331e218ba1daa07684c832f516e7157e511594d2cc6fbf5235d9d06377dc6b3a52c4175df1c6f75387e43"

RPROVIDES:${PN} += "libfife.so.0.4.2 \
libfife0-4-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libGL.so.1 \
libGLEW.so.2.3 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libfifechan-opengl.so.0.1.5 \
libfifechan-sdl.so.0.1.5 \
libfifechan.so.0.1.5 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libtinyxml.so.0 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
