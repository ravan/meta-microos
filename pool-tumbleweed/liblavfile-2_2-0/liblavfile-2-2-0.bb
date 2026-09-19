SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavfile-2_2-0-2.2.1-3.6.aarch64.rpm"
RPM_HASH = "f12c2af428e6f0897ff70eba593ff1a610b25aa38a986c79f1e928e1f6b5699baa1f0da582f97cbc7ea27c9702baeb3a46b9ac7cca41c267a23d9439098fe5f3"

RPROVIDES:${PN} += "liblavfile-2-2-0 \
liblavfile-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdv.so.4 \
libmjpegutils-2.2.so.0 \
libquicktime.so.0"

inherit rpm
