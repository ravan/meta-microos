SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9-libavfilter-devel-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "f72cf3fb187ab41166d632b5ca791ac9f0db73ac52f47e199e72c8616a8827067b8a7259715e69fa40b994f56f6c16efc76c4196fc5efccf907a71ff02cb2d5b"

RPROVIDES:${PN} += "ffmpeg-9-libavfilter-devel \
libavfilter-devel \
pkgconfig-libavfilter"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-9-libavcodec-devel \
ffmpeg-9-libavformat-devel \
ffmpeg-9-libavutil-devel \
ffmpeg-9-libswresample-devel \
ffmpeg-9-libswscale-devel \
libavfilter12 \
pkgconfig-libavcodec \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
