SUMMARY = "Command-line utilities for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
This subpackage contains the command-line utilities. \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "d0812a6b9fa4bd4960dc50de781366c384560875683d38cb8a643397b63cba293b917855c39da9c9d767059e0622ef88c70c408d1cd5be206fca4dfe58a45a3a"

RPROVIDES:${PN} += "ffmpeg \
ffmpeg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.63 \
libavdevice.so.63 \
libavfilter.so.12 \
libavformat.so.63 \
libavutil.so.61 \
libc.so.6 \
libm.so.6 \
libplacebo.so.360 \
libswresample.so.7 \
libswscale.so.10 \
libz.so.1"

inherit rpm
