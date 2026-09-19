SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "libavfilter12-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "354a85fe84b60677cbdbc8fc68914f235f3f2a29ec51e41ec680808ff0d728847cb299d3c0237bc9f22a3436ec96313ac1db4d1d1039fd4525b649a3c489cdac"

RPROVIDES:${PN} += "libavfilter.so.12 \
libavfilter12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libass.so.9 \
libavcodec.so.63 \
libavcodec63 \
libavformat.so.63 \
libavformat63 \
libavutil.so.61 \
libavutil61 \
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
libswresample.so.7 \
libswresample7 \
libswscale.so.10 \
libswscale10 \
libva.so.2 \
libvidstab.so.1.2 \
libvmaf.so.3 \
libz.so.1 \
libzimg.so.2 \
libzmq.so.5"

inherit rpm
