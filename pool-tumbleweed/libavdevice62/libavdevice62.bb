SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "libavdevice62-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "4b06f3c5d2813e50edfdca1b954b4483c4a40602d02cc7dafeb28fbd7b4880b69cc8e7f40608da2fec7f7df9a4a139cbf66f3d4b1ca02798171ca470bfbd56b9"

RPROVIDES:${PN} += "libavdevice.so.62 \
libavdevice62"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libavc1394.so.0 \
libavcodec.so.62 \
libavcodec62 \
libavfilter.so.11 \
libavfilter11 \
libavformat.so.62 \
libavformat62 \
libavutil.so.60 \
libavutil60 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libdc1394.so.26 \
libdrm.so.2 \
libiec61883.so.0 \
libjack.so.0 \
libpulse.so.0 \
libraw1394.so.11 \
librom1394.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
