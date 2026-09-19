SUMMARY = "Demos for FTGL OpenGL font managing library"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes. \
 \
This package provides demo application showing usage of the library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "ftgl-demo-2.4.0-3.5.aarch64.rpm"
RPM_HASH = "5d3e7779126f39ecba60a4cf6f5cc561b79b66882befe7ebb5c564cab13292a601f3262cb0faa4461fe14c7859dfd9e54781cc49afccf4c84d61553b2d259325"

RPROVIDES:${PN} += "ftgl-demo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libftgl.so.2 \
libgcc-s.so.1 \
libglut.so.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
