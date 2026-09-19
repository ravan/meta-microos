SUMMARY = "Header files for feature-reduced FFmpeg build"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains the headers accompanying ffmpeg-8-mini."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-mini-devel-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "78b1bd5b2f8c2297407a53c80ec9918c1faf3e4a00d11c07b246cb21f87b7c37b000a23523128b8c402a029988659cf1e8331d17185c3763d556c27a6bab1a7d"

RPROVIDES:${PN} += "ffmpeg-8-mini-devel \
libavcodec-devel \
libavdevice-devel \
libavfilter-devel \
libavformat-devel \
libavutil-devel \
libswresample-devel \
libswscale-devel \
pkgconfig-libavcodec \
pkgconfig-libavdevice \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libswresample \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-8-mini-libs \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libswresample \
pkgconfig-libswscale \
this-is-only-for-build-envs"

inherit rpm
