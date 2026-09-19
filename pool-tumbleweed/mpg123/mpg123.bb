SUMMARY = "Console MPEG audio player and decoder library"
DESCRIPTION = "The mpg123 distribution contains an MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1, 2 and 3 (most commonly MPEG 1.0 Layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "mpg123-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "e405390c5702e18e3cc209d41a9a0661f0b46f9e8993f2b3af8fe329eaa22b84984ee1b7ca6085a7d01c21ff3325cb8d9c2b4a1c3af4491cd1e92f2ad1a20f4c"

RPROVIDES:${PN} += "mpg123"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libmpg123.so.0 \
libout123.so.0 \
libsyn123.so.0"

inherit rpm
