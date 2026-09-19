SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmplex2-2_2-0-2.2.1-3.6.aarch64.rpm"
RPM_HASH = "ed34cbbd6b4a9a5a1b3438ac2539320e4bf6a4f7f810001da7bdfcccddc8bfd14703ba562970e6fe8f514907f072da3ec37bf7599d99749c893b8ef21b66b7c0"

RPROVIDES:${PN} += "libmplex2-2-2-0 \
libmplex2-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmjpegutils-2.2.so.0 \
libstdc++.so.6"

inherit rpm
