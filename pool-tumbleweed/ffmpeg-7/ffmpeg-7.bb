SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "be352a56747b717c53b8e4d11e63c7b51bcefa6982dc90ff977d9c6b1d4eb4a47deb38525d0016d050cdd07e01bf42d7ea3f140f1924777c40b40425b13a035d"

RPROVIDES:${PN} += "ffmpeg \
ffmpeg-7 \
ffmpeg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.61 \
libavdevice.so.61 \
libavfilter.so.10 \
libavformat.so.61 \
libavutil.so.59 \
libc.so.6 \
libm.so.6 \
libplacebo.so.360 \
libpostproc.so.58 \
libswresample.so.5 \
libswscale.so.8 \
libz.so.1"

inherit rpm
