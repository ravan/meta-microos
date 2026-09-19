SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmjpegutils-2_2-0-2.2.1-3.6.aarch64.rpm"
RPM_HASH = "d45d4c35d7682beac95f69973b4574a5c61c7c80025112de7f28a3887709fa9facc7081918155dee748e8fdc7ed5889026748f558fcbe22233f09619fce3057c"

RPROVIDES:${PN} += "libmjpegutils-2-2-0 \
libmjpegutils-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
