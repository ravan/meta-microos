SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "libavfilter7_110-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "12d053d13f58bbb728aa55ebf3453492082a938464d458718b693aa3013c35f6a504f7eb05fcd079fefdab26f459b578f8593730fc99b81947589809dfd166cb"

RPROVIDES:${PN} += "libavfilter.so.7.110 \
libavfilter7-110"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libass.so.9 \
libavcodec.so.58.134 \
libavcodec58-134 \
libavformat.so.58.76 \
libavformat58-76 \
libavresample.so.4.0 \
libavresample4-0 \
libavutil.so.56.70 \
libavutil56-70 \
libbs2b.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libglslang.so.16 \
liblilv-0.so.0 \
libm.so.6 \
libmysofa.so.1 \
libpostproc.so.55.9 \
libpostproc55-9 \
librubberband.so.3 \
libstdc++.so.6 \
libswresample.so.3.9 \
libswresample3-9 \
libswscale.so.5.9 \
libswscale5-9 \
libva.so.2 \
libvidstab.so.1.2 \
libvulkan.so.1 \
libzimg.so.2 \
libzmq.so.5"

inherit rpm
