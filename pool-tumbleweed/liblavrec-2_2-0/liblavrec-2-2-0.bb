SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavrec-2_2-0-2.2.1-3.6.aarch64.rpm"
RPM_HASH = "c3a06271c49b52602b34bd933a8d6f50a83aea78c83fc8c51eb4bf4b4ae58963c3b424ceb995d023e8c8e3f5b5d37a072abce7e0d9643934ddbc7cd02ce48367"

RPROVIDES:${PN} += "liblavrec-2-2-0 \
liblavrec-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblavfile-2.2.so.0 \
liblavjpeg-2.2.so.0 \
libmjpegutils-2.2.so.0"

inherit rpm
