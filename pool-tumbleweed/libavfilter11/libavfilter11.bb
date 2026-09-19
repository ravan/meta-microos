SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "libavfilter11-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "d825fe0be4c5a32ad11765e57dcc3315613611c7a28add0692e768b4546f23bfc76b1330d79be3b8bba562a6d06d7fd5b05bfc7a7dc2a92f665bc56a834010e7"

RPROVIDES:${PN} += "libavfilter.so.11 \
libavfilter11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libass.so.9 \
libavcodec.so.62 \
libavcodec62 \
libavformat.so.62 \
libavformat62 \
libavutil.so.60 \
libavutil60 \
libbs2b.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libharfbuzz.so.0 \
liblilv-0.so.0 \
libm.so.6 \
libmysofa.so.1 \
libplacebo.so.360 \
librubberband.so.3 \
libshaderc-shared.so.1 \
libswresample.so.6 \
libswresample6 \
libswscale.so.9 \
libswscale9 \
libva.so.2 \
libvidstab.so.1.2 \
libvmaf.so.3 \
libz.so.1 \
libzimg.so.2 \
libzmq.so.5"

inherit rpm
