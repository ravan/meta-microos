SUMMARY = "FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "libavformat63-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "6c96f686a3bae68e5aaad7e1f5eebce65553acb2e9d08232e4a73cae9b01b208abf65a06d338356ff130a38dc3df658d51415db10b13efcd8fb803acf8b5e1c7"

RPROVIDES:${PN} += "libavformat.so.63 \
libavformat63"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.63 \
libavcodec63 \
libavutil.so.61 \
libavutil61 \
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
