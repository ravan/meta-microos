SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "libavdevice63-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "69d0d36b52ecfdf2a8ff4101b79609f26686974f88e4ccac14ee1262cf4b97471019fb4a443e4b6f035f7a7ae684f149fcfab6170d62bf74cef16ac766641bf6"

RPROVIDES:${PN} += "libavdevice.so.63 \
libavdevice63"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libavc1394.so.0 \
libavcodec.so.63 \
libavcodec63 \
libavfilter.so.12 \
libavfilter12 \
libavformat.so.63 \
libavformat63 \
libavutil.so.61 \
libavutil61 \
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
