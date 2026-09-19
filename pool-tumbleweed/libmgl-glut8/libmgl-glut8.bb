SUMMARY = "MathGL window library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "libmgl-glut8-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "aa52aa69d6ac5a0d5af5c4b0308703740185d4d3d04b0009d58edf87e95067ca8a831d6bced115d16a3243abf11e50ad14d3dedbcc8655eb9832b222385c1ce0"

RPROVIDES:${PN} += "libmgl-glut.so.8 \
libmgl-glut8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
