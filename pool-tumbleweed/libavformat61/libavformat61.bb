SUMMARY = "FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "libavformat61-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "ec5b2f66328d088efc668b2f16bb123207f90ae7d1d845ec37e8dd542c87eec2379ff5b30caac88479bdfdf601213c05a26a4e05eeb08fb7e700375c374eedbe"

RPROVIDES:${PN} += "libavformat.so.61 \
libavformat61"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.61 \
libavcodec61 \
libavutil.so.59 \
libavutil59 \
libbluray.so.3 \
libbz2.so.1 \
libc.so.6 \
libgnutls.so.30 \
libm.so.6 \
libopenmpt.so.0 \
librist.so.4 \
libsrt.so.1.5 \
libssh.so.4 \
libxml2.so.16 \
libz.so.1 \
libzmq.so.5"

inherit rpm
