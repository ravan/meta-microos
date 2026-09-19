SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavplay-2_2-0-2.2.1-3.6.aarch64.rpm"
RPM_HASH = "8a3608cd69437d21d6e23b65cba567a8022a1ccff485ddf454a74215c2aed882a25ff110e33c9d35c8ed294778919188b20118d15622b75612d39c9d5f494c47"

RPROVIDES:${PN} += "liblavplay-2-2-0 \
liblavplay-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libX11.so.6 \
libc.so.6 \
libdv.so.4 \
liblavfile-2.2.so.0 \
liblavjpeg-2.2.so.0 \
libmjpegutils-2.2.so.0"

inherit rpm
