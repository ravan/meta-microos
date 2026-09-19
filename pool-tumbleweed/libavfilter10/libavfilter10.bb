SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "libavfilter10-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "000de5c2cce740bb414548bbe535e75a487479ac5712754cf4d119789ca1732e211d186687c4d7cc770c2605b1417e40c6f8741d92c763dda65abf85122b0a2d"

RPROVIDES:${PN} += "libavfilter.so.10 \
libavfilter10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libass.so.9 \
libavcodec.so.61 \
libavcodec61 \
libavformat.so.61 \
libavformat61 \
libavutil.so.59 \
libavutil59 \
libbs2b.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
liblilv-0.so.0 \
libm.so.6 \
libmysofa.so.1 \
libplacebo.so.360 \
libpostproc.so.58 \
libpostproc58 \
librubberband.so.3 \
libshaderc-shared.so.1 \
libswresample.so.5 \
libswresample5 \
libswscale.so.8 \
libswscale8 \
libva.so.2 \
libvidstab.so.1.2 \
libvmaf.so.3 \
libzimg.so.2 \
libzmq.so.5"

inherit rpm
