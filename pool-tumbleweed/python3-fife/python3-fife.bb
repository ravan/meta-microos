SUMMARY = "Python 3 extensions for the FIFE engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "python3-fife-0.4.2-10.10.aarch64.rpm"
RPM_HASH = "5e57247f1a49b3bf4d240742b5cdcfd9bdbb7bd6dccecb84e64f6e3dacc0d1c57b527322a4ece5ab053f6dc118d9727a6eba4631ec1320a697f082544a041917"

RPROVIDES:${PN} += "python3-fife"

RDEPENDS:${PN} += "libGL.so.1 \
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
libpython3.13.so.1.0 \
libstdc++.so.6 \
libtinyxml.so.0 \
libvorbisfile.so.3 \
libz.so.1 \
python-abi \
python3"

inherit rpm
