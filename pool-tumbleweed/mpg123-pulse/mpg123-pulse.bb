SUMMARY = "Pulseaudio Support for mpg123"
DESCRIPTION = "The mpg123 distribution contains a real time MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1,2 and 3 (most commonly MPEG 1.0 layer 3 aka MP3), as well as re-usable decoding \
and output libraries. \
 \
This package contains the plugin for Pulseaudio output support."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "mpg123-pulse-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "00158f06a843c3b7b969db4aa24640cd64dea5795a9c0f0e8efc517025a52ba6d78004dbe3f97583c169de3868a97d1199fd2de1d17665fe8c915938fad56340"

RPROVIDES:${PN} += "mpg123-pulse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
