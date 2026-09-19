SUMMARY = "MathGL Qt(6) widget library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "libmgl-qt-8-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "313d2a9556c979446f2e7999b5e03cae47c87a16a4a4d5effa81d3b8afc602a87b58c89f608059f922a0636d8fcd26e840be69bdb4819f1187c06fb4f2e24d3a"

RPROVIDES:${PN} += "libmgl-qt-8 \
libmgl-qt.so.8 \
libmgl-qt6-8 \
libmgl-qt6.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
