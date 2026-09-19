SUMMARY = "Fast-paced first person ego shooter"
DESCRIPTION = "Red Eclipse 2 is a first-person shooter based on the tesseract engine. \
Parkour gameplay, different game modes, and several mutators to make the game very flexible. \
A map editor is included."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-2.0.0-5.1.aarch64.rpm"
RPM_HASH = "2c77d47bcb33d0a824a128256829b4425ebbe5875b349a502d1aac63f3ce3a62ed3f28f7c535e5052010885a54ecb35a3fd2f9b998b7667ad2bda6a970f33d69"

RPROVIDES:${PN} += "redeclipse"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libenet.so.7 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
redeclipse-data"

inherit rpm
