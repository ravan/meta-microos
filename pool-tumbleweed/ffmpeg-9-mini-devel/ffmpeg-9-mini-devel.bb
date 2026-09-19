SUMMARY = "Header files for feature-reduced FFmpeg build"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains the headers accompanying ffmpeg-9-mini."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9-mini-devel-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "7c162ca1e3090d2d6a803c79b4d7727c2f897df7c58bd388c861536dab443ce396a452a943a192111f1ececbe9b1caee97ce328a795083a377844d19b613fffb"

RPROVIDES:${PN} += "ffmpeg-9-mini-devel \
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
ffmpeg-9-mini-libs \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libswresample \
pkgconfig-libswscale \
this-is-only-for-build-envs"

inherit rpm
