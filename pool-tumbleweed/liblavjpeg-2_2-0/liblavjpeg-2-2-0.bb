SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "liblavjpeg-2_2-0-2.2.1-3.6.aarch64.rpm"
RPM_HASH = "1525b5a77e4f2c7cd17d19eee4d023c9a7b596d27337c8c9c08fd9f2de5665503c5bfeb3f23d5102e2a9e16be7648589e8059b94b3ffdeab4e35df5d196f841f"

RPROVIDES:${PN} += "liblavjpeg-2-2-0 \
liblavjpeg-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libmjpegutils-2.2.so.0"

inherit rpm
