SUMMARY = "OpenAL Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for openal output support."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "mpg123-openal-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "c3435c2092f28be7026d88471e8710cf4351f4bed1eaa866aff48d1ce530b44f7d38b8e6433dad63168bcb512b08fb3e59fc59d9a1a8d57fdd9aa981f5750bdd"

RPROVIDES:${PN} += "mpg123-openal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libopenal.so.1"

inherit rpm
