SUMMARY = "Ogg Vorbis Tools"
DESCRIPTION = "This package contains some tools for Ogg Vorbis: \
 \
oggenc (an encoder) and ogg123 (a playback tool). It also has vorbiscomment (to \
add comments to Vorbis files), ogginfo (to give all useful information about an \
Ogg file, including streams in it), oggdec (a simple command line decoder), and \
vcut (which allows you to cut up Vorbis files)."
LICENSE = "GPL-2.0-only"

PV = "1.4.3"

RPM_NAME = "vorbis-tools-1.4.3-2.2.aarch64.rpm"
RPM_HASH = "d083944ca8d9b34f74e2828a72655b6f17d2801b4ef962d4b43b5f6189c6a7bdf8c7f39c44990f9b5155f5725f47e0b3cb6a51765416574ceccb1d1e7b1b2830"

RPROVIDES:${PN} += "vorbis-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libao.so.4 \
libc.so.6 \
libcurl.so.4 \
libkate.so.1 \
libm.so.6 \
libogg.so.0 \
liboggkate.so.1 \
libspeex.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3"

inherit rpm
