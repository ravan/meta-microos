SUMMARY = "SDL Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for SDL output support."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "mpg123-sdl-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "8ca5ecdd9cef3767f4800711fc69a1f2f6657e37e42e91ca88f108b6976f5d2935f5bf911e8d49b111e7a166afadbf237fbd2d2006e7b7e76f62015084b4e3c5"

RPROVIDES:${PN} += "mpg123-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
