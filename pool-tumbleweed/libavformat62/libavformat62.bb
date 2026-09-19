SUMMARY = "FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "libavformat62-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "6842bdb3bc1d87d50f20e705fcdb0bf4da43356afe7ce846bbdef68d1ed7c683ac01d1b59b1133fc4a717e06220c97e7325f143fb5eb82283107722cef7a8d84"

RPROVIDES:${PN} += "libavformat.so.62 \
libavformat62"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavcodec62 \
libavutil.so.60 \
libavutil60 \
libbluray.so.3 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libopenmpt.so.0 \
librist.so.4 \
libsrt.so.1.5 \
libssh.so.4 \
libssl.so.3 \
libxml2.so.16 \
libz.so.1 \
libzmq.so.5"

inherit rpm
