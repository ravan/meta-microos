SUMMARY = "MP3 Encoder for RTP Streaming"
DESCRIPTION = "LAME is an encoder that converts audio to the MP3 file format. It has \
an improved psychoacoustic model and performs well in codec listening \
tests. \
 \
This package includes 'mp3rtp', an MP3 encoder with RTP streaming of the output."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "lame-mp3rtp-3.100-5.15.aarch64.rpm"
RPM_HASH = "1599dd9419c6ba8c5f83c6fef359618e05c2efdbf43c36a351d9ed1aadcab04369e7aa5fde679f31c0452964916bbab4432c4aaee2521f899b96cbc39d868b74"

RPROVIDES:${PN} += "lame-mp3rtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmp3lame.so.0 \
libmp3lame0 \
libtinfo.so.6"

inherit rpm
