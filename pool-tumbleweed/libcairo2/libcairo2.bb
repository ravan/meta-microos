SUMMARY = "Vector Graphics Library with Cross-Device Output Support"
DESCRIPTION = "Cairo is a vector graphics library with cross-device output support. \
Currently supported output targets include the X Window System, \
in-memory image buffers, and PostScript. Cairo is designed to produce \
identical output on all output media while taking advantage of display \
hardware acceleration when available."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.18.4"

RPM_NAME = "libcairo2-1.18.4-4.5.aarch64.rpm"
RPM_HASH = "cf2a84b1adc5cf446befdc813c560e74cb9dd763e64bff78a1b96e19a9716faee6bab0309fe78559f50a2b1af7f5183d45a8e5a29803480090a9c857961a1518"

RPROVIDES:${PN} += "cairo \
libcairo.so.2 \
libcairo2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrender.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libxcb-render.so.0 \
libxcb-shm.so.0 \
libxcb.so.1 \
libz.so.1"

inherit rpm
