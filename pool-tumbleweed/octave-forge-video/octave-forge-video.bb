SUMMARY = "A wrapper for OpenCV's CvCapture_FFMPEG and CvVideoWriter_FFMPEG"
DESCRIPTION = "A wrapper for OpenCV's CvCapture_FFMPEG and CvVideoWriter_FFMPEG. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.3"

RPM_NAME = "octave-forge-video-2.1.3-2.6.aarch64.rpm"
RPM_HASH = "1304f783cf0cbd0bdb2599a8c148a5f408e906fab25dd95125c5bd4b4cb881d6ae52e53161fc28d62873393d25ceba58633fbc61fa708e3051c068fe973164e6"

RPROVIDES:${PN} += "octave-forge-video"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavcodec.so.61 \
libavformat.so.61 \
libavutil.so.59 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libswscale.so.8 \
octave-api-v61 \
octave-cli"

inherit rpm
