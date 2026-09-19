SUMMARY = "Animated sprite editor & pixel art tool"
DESCRIPTION = "LibreSprite is an open source program to create animated sprites \
for websites and games."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.1"

RPM_NAME = "libresprite-1.1-2.8.aarch64.rpm"
RPM_HASH = "7fc40f9cea8c357e59c319f741081fc00e4cdcb1ce4cb9ea04c18f66f8f40d239f2652681558e472fecf0a072465dabfce95e6d05b131ba56aaf5f689005201a"

RPROVIDES:${PN} += "libresprite"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libjpeg.so.8 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtinyxml2.so.11 \
libwebp.so.7 \
libxcb.so.1 \
libz.so.1"

inherit rpm
