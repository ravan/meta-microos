SUMMARY = "Header files for feature-reduced FFmpeg build"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains the headers accompanying ffmpeg-7-mini."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-mini-devel-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "ec4f1d69d72b86067ad3ad5965981d4ef4a78fb6b640295c22cfa505d01391c99cc4f67612d0c153ccae4a3976c4f960dc86545f6a2836aeb4cf6fe58837e271"

RPROVIDES:${PN} += "ffmpeg-7-mini-devel \
libavcodec-devel \
libavdevice-devel \
libavfilter-devel \
libavformat-devel \
libavutil-devel \
libpostproc-devel \
libswresample-devel \
libswscale-devel \
pkgconfig-libavcodec \
pkgconfig-libavdevice \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-7-mini-libs \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale \
this-is-only-for-build-envs"

inherit rpm
