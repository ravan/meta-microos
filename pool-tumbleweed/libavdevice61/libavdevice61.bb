SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "libavdevice61-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "8f28d2ef8385b2e6a0a29b2ab48b2ad9a9c81d2b451dbacd8c6a1bb6e3b734e079919dc7623059127012742a4e097b3d19dc68d3d875d5c6cbe6d43fbace9569"

RPROVIDES:${PN} += "libavdevice.so.61 \
libavdevice61"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libavc1394.so.0 \
libavcodec.so.61 \
libavcodec61 \
libavfilter.so.10 \
libavfilter10 \
libavformat.so.61 \
libavformat61 \
libavutil.so.59 \
libavutil59 \
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
