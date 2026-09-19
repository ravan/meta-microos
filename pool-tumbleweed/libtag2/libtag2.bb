SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3"

RPM_NAME = "libtag2-2.3-1.2.aarch64.rpm"
RPM_HASH = "08b876422f6feb740e02d8e36fdd45d9c744269682963bf1058411ccb12fffa55a333bfb3a5bfc9736c23f6281a2ea122ad6e51b604d37c821b59c0f4703832c"

RPROVIDES:${PN} += "libtag.so.2 \
libtag2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
