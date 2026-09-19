SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-libavfilter-devel-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "482d694e55f6424cb71c3fb572ecfb138a42e49787dbdeff9e34530d399f98815ce786e301ad7289d45ef9bad8f65bfa2e4efca94f0aadc76d8ce1a2d642d5ae"

RPROVIDES:${PN} += "ffmpeg-8-libavfilter-devel \
libavfilter-devel \
pkgconfig-libavfilter"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-8-libavcodec-devel \
ffmpeg-8-libavformat-devel \
ffmpeg-8-libavutil-devel \
ffmpeg-8-libswresample-devel \
ffmpeg-8-libswscale-devel \
libavfilter11 \
pkgconfig-libavcodec \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
