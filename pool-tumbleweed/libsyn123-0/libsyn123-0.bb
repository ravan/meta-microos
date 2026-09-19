SUMMARY = "MPEG audio decoder library"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "libsyn123-0-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "dc5eb491be726ff9de75e9a66c9591c39588a172abc3e053bbdcf1b1e9d881a2783f01786bcacabedb7c5b4e39e05ab9ce05115d5d090d164048699b400fd7e3"

RPROVIDES:${PN} += "libsyn123-0 \
libsyn123.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
