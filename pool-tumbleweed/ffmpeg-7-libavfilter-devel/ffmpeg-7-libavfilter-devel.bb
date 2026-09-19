SUMMARY = "Development files for FFmpeg's audio/video filter library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks. \
 \
This subpackage contains the headers for FFmpeg libavfilter."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-libavfilter-devel-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "56a8e69def56f528ae6b0ef5d380216b57195bdc2ec08840b1a02bc692db5c8f262870842cc423322398a10fd69afab382b9d6ccb3c21b6e3e7a29fac9793f8c"

RPROVIDES:${PN} += "ffmpeg-7-libavfilter-devel \
libavfilter-devel \
pkgconfig-libavfilter"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-7-libavcodec-devel \
ffmpeg-7-libavformat-devel \
ffmpeg-7-libavutil-devel \
ffmpeg-7-libpostproc-devel \
ffmpeg-7-libswresample-devel \
ffmpeg-7-libswscale-devel \
libavfilter10 \
pkgconfig-libavcodec \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
