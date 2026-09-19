SUMMARY = "Jack Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for JACK output support."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "mpg123-jack-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "c8c3754d97dc886d2fb6f1c44711b6729dba4fb0c1a58534ba10bf3f7a1be325f16156c9b6468eb26e74c602ea26367f9af42de5a2dd0addfb6282af70a80987"

RPROVIDES:${PN} += "mpg123-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0"

inherit rpm
