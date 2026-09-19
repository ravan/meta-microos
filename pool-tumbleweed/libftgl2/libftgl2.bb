SUMMARY = "Library for Using Arbitrary Fonts in OpenGL Applications"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libftgl2-2.4.0-3.5.aarch64.rpm"
RPM_HASH = "20c36045a4ef6bad226a31763efe3e74a07004f7958d2167b72e5e551cfa178e1bc26d9dcc74d909345b75bb9ced9c0dd16eb7ea19675edebc18d7adbf05d15a"

RPROVIDES:${PN} += "libftgl.so.2 \
libftgl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
