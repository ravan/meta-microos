SUMMARY = "FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "libavformat58_76-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "b6de03454a9947098c3f9ccad32e232cf71f9aad429bf618ff8b947b4505736066ad3e564bd4808ffb458de89707935fc848d2396d5c978e0266f922f98a3864"

RPROVIDES:${PN} += "libavformat.so.58.76 \
libavformat58-76"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libavcodec58-134 \
libavutil.so.56.70 \
libavutil56-70 \
libbluray.so.3 \
libbz2.so.1 \
libc.so.6 \
libgnutls.so.30 \
libm.so.6 \
libopenmpt.so.0 \
libsrt.so.1.5 \
libssh.so.4 \
libxml2.so.16 \
libz.so.1 \
libzmq.so.5"

inherit rpm
