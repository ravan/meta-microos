SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "libavcodec58_134-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "3c826da38bf26093bad531b53c3c2132a576a010f1f43c502e473a29e824030b7f3ee73092b8b81f592ecde09961f4bc5b3cc68dd1e6f08f31f190f7aecd5534"

RPROVIDES:${PN} += "libavcodec \
libavcodec.so.58.134 \
libavcodec58-134"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaom.so.3 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libcodec2.so.1.2 \
libdav1d.so.7 \
libgsm.so.1 \
libm.so.6 \
libmp3lame.so.0 \
libopencore-amrnb.so.0 \
libopencore-amrwb.so.0 \
libopenjp2.so.7 \
libopus.so.0 \
librav1e.so.0.8 \
libspeex.so.1 \
libswresample.so.3.9 \
libswresample3-9 \
libtheoradec.so.2 \
libtheoraenc.so.2 \
libtwolame.so.0 \
libva.so.2 \
libvo-amrwbenc.so.0 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvpx.so.12 \
libwebp.so.7 \
libwebpmux.so.3 \
libxvidcore.so.4 \
libz.so.1 \
libzvbi.so.0"

inherit rpm
