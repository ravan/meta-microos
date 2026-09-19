SUMMARY = "MathGL FLTK widget library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "libmgl-fltk8-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "12b1ebfe15dc70eb14258b3a0327a83661c9a80c1cc4ec0f9fc0fde3c14e50068ee9ab45c166049a5c19f1f9ff549a2e721f9b980bbed9bce6c97989cad3b1e0"

RPROVIDES:${PN} += "libmgl-fltk.so.8 \
libmgl-fltk8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
