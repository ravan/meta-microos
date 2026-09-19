SUMMARY = "MathGL window library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "libmgl-wnd8-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "828623cd751dd8f3e2bbcfe61b984e9944eecf74b2f8039362057e89014342ad9f09ed219faabf549595b5c8fcaca50af0c1b4043743e2652865e520b26fbb55"

RPROVIDES:${PN} += "libmgl-wnd.so.8 \
libmgl-wnd8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
