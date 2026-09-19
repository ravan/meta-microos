SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3"

RPM_NAME = "libtag_c2-2.3-1.2.aarch64.rpm"
RPM_HASH = "3872e325f08102a81e312ef26b288a71b08cdb7bb1fbfe0b1587930b37997d5fd77e2e1edf0c4c23f0de9f575a8988c8a0dd02ea9d4c54c33823c1c2244fb549"

RPROVIDES:${PN} += "libtag-c.so.2 \
libtag-c2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.2"

inherit rpm
