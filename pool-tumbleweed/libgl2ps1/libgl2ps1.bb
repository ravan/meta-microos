SUMMARY = "OpenGL to PostScript Printing Library"
DESCRIPTION = "GL2PS is a C library providing vector output for any OpenGL \
application. It uses sorting algorithms capable of handling \
intersecting and stretched polygons, as well as non-manifold objects. \
GL2PS provides smooth shading and text rendering, culling of \
invisible primitives and mixed vector/bitmap output."
LICENSE = "LGPL-2.0-or-later | SUSE-GL2PS-2.0"

PV = "1.4.2"

RPM_NAME = "libgl2ps1-1.4.2-1.24.aarch64.rpm"
RPM_HASH = "b638786fa36ea7d1cbc5b84929ff29034d84804cd6397497cd1cfd64703c422718d837a211e35b8067425a218506abaaec27e75fcb7ff738add09a1fcc32c1f1"

RPROVIDES:${PN} += "libgl2ps.so.1 \
libgl2ps1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
