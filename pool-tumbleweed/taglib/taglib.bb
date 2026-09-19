SUMMARY = "Audio Meta-Data Library"
DESCRIPTION = "TagLib is a library for reading and editing the meta-data of several popular \
audio formats. Currently it supports both ID3v1 and ID3v2 for MP3 files, Ogg \
Vorbis comments and ID3 tags and Vorbis comments in FLAC, MPC, Speex, WavPack \
TrueAudio, WAV, AIFF, MP4 and ASF files. \
 \
This package contains built examples to read and write tags from the \
command line."
LICENSE = "LGPL-2.1-or-later & MPL-1.1"

PV = "2.3"

RPM_NAME = "taglib-2.3-1.2.aarch64.rpm"
RPM_HASH = "d6e821c134f77c4f307aa0485a0a43c77f5afbed8f0492b7999387dc3bfcea8b37d83b57a220b5c7f1b95923a95dab32ff60a25d0dd9f9bc52099f0e251cfc94"

RPROVIDES:${PN} += "taglib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag-c.so.2 \
libtag.so.2"

inherit rpm
