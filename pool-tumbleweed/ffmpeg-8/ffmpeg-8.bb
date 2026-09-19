SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "3156caf56b1ce7059c685fdeca24c0008c2be9c927804e780abce3e26e9e64c00e6504485c19bb5db579c0905896577ff089fee88d967508210212f8d7a572f9"

RPROVIDES:${PN} += "ffmpeg \
ffmpeg-8 \
ffmpeg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.62 \
libavdevice.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libm.so.6 \
libplacebo.so.360 \
libswresample.so.6 \
libswscale.so.9 \
libz.so.1"

inherit rpm
