SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "libmpeg2encpp-2_2-0-2.2.1-3.6.aarch64.rpm"
RPM_HASH = "a7bfdc7d8b03b19e43cfae14cc9a6cebc1f51161977cb72c23790e2ddd70713110b61fea71b23d6541c7267e90ff0dfedcd1ba75b4095dd90ba99f2e1f22f93a"

RPROVIDES:${PN} += "libmpeg2encpp-2-2-0 \
libmpeg2encpp-2.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmjpegutils-2.2.so.0 \
libstdc++.so.6"

inherit rpm
