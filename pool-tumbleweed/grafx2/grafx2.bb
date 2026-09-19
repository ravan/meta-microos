SUMMARY = "Pixel Art editor"
DESCRIPTION = "GrafX2 is a bitmap paint program inspired by the Amiga programs Deluxe Paint and Brilliance."
LICENSE = "GPL-2.0-only"

PV = "2.9"

RPM_NAME = "grafx2-2.9-1.6.aarch64.rpm"
RPM_HASH = "3d6d54f311daa5957eaf8710ffe75a68f220c5700e4c3ff685310a0fc2319e4e9abfea84a0de2779da473d9dc6d18931c5de71563633c2982f53be392d6bb417"

RPROVIDES:${PN} += "bundled-6502 \
bundled-recoil \
grafx2"

RDEPENDS:${PN} += "libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libfontconfig.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
libz.so.1"

inherit rpm
