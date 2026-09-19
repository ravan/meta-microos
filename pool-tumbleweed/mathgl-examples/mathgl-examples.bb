SUMMARY = "Examples for mathgl library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package contains examples of using MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-examples-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "5dc83793d9f8d243a77fcf83506689c419836ef500fb62fc7505acc46f87e1c7c0e83ff1e4f0e66359f5214866e8da274f2f9f2fb23d2af0a9c2b9e818857adf"

RPROVIDES:${PN} += "mathgl-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libQt6Core.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgomp.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libhdf5.so.310 \
libhpdf.so.2.4 \
libjpeg.so.8 \
libltdl.so.7 \
libm.so.6 \
libmgl-fltk.so.8 \
libmgl-glut.so.8 \
libmgl-qt.so.8 \
libmgl-wx.so.8 \
libmgl.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libz.so.1"

inherit rpm
