SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "libavdevice58_13-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "b98e0dbd4c8d90bcfce670b1a9d15943744522777dc29087cacb71442a071f82b56843ba4c9f1caf560c328448a0101b5f3e18f883bd7c269d40453fd39f10c7"

RPROVIDES:${PN} += "libavdevice.so.58.13 \
libavdevice58-13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libavcodec.so.58.134 \
libavcodec58-134 \
libavfilter.so.7.110 \
libavfilter7-110 \
libavformat.so.58.76 \
libavformat58-76 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libdc1394.so.26 \
libdrm.so.2 \
libjack.so.0 \
libpulse.so.0 \
libv4l2.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1"

inherit rpm
