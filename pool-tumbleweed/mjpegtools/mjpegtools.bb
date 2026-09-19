SUMMARY = "MJPEG Video Capture and Processing Tools"
DESCRIPTION = "The mjpegtools allow for capture, playback, processing, and simple \
editing of MJPEG AV data. The hardware I/O applications are intended \
for use with Zoran MJPEG framegrabber-based hardware (see the \
zoran-driver package), but the processing tools can be used with MJPEG \
data from other sources as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "mjpegtools-2.2.1-3.6.aarch64.rpm"
RPM_HASH = "522ba03ad820d3136c56501f20b7a64f9400334b5480044440e628720820ff50bd5087d15986fd0fd4faf2edf2683bfe49f557cba1b74fc4c3962d33950cbdd4"

RPROVIDES:${PN} += "mjpegtools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-gfx.so.16 \
libc.so.6 \
libdv.so.4 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblavfile-2.2.so.0 \
liblavjpeg-2.2.so.0 \
liblavplay-2.2.so.0 \
liblavrec-2.2.so.0 \
libm.so.6 \
libmjpegutils-2.2.so.0 \
libmpeg2encpp-2.2.so.0 \
libmplex2-2.2.so.0 \
libpng16.so.16 \
libquicktime.so.0 \
libstdc++.so.6"

inherit rpm
