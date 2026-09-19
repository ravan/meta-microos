SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-libavfilter-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "85e3d7df7e1ffe4a4306f999aa91e2059af2fb29afead89af92dfdd9da93bf7f035546b6d9015c92a00dd306bd5923256c1a883408eb1f0ab5c952ed7653ef86"

RPROVIDES:${PN} += "ffmpeg-4-libavfilter-devel \
libavfilter-devel \
pkgconfig-libavfilter"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavformat-devel \
ffmpeg-4-libavresample-devel \
ffmpeg-4-libavutil-devel \
ffmpeg-4-libpostproc-devel \
ffmpeg-4-libswresample-devel \
ffmpeg-4-libswscale-devel \
libavfilter7-110 \
pkgconfig-libavcodec \
pkgconfig-libavformat \
pkgconfig-libavresample \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
