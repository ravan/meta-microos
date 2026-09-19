SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "libavcodec62-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "994848f62247b2be118abbcf12bac51231156a65b52fe9420341cad86cfc0a61fab2e290a0cfc267b90668c3d5cf8601c71129a1e49f30e84b8e831ca3010bca"

RPROVIDES:${PN} += "libavcodec \
libavcodec.so.62 \
libavcodec62"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSvtAv1Enc.so.4 \
libaom.so.3 \
libavutil.so.60 \
libavutil60 \
libc.so.6 \
libcodec2.so.1.2 \
libdav1d.so.7 \
libgsm.so.1 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libm.so.6 \
libmp3lame.so.0 \
libopencore-amrnb.so.0 \
libopencore-amrwb.so.0 \
libopenh264.so.8 \
libopenjp2.so.7 \
libopus.so.0 \
librav1e.so.0.8 \
libspeex.so.1 \
libswresample.so.6 \
libswresample6 \
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
