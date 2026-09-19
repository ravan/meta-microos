SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9-libavdevice-devel-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "771a4b16ab45028ff9def1728fa2a50386f53045bb85f8e2c3e9d20e0bd588f102923d69a4e4d0c7d00ca5cfe7dc610a9f214f1417a51a387ca999afbd3fb2c4"

RPROVIDES:${PN} += "ffmpeg-9-libavdevice-devel \
ffmpeg-devel \
libavdevice-devel \
pkgconfig-libavdevice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-9-libavcodec-devel \
ffmpeg-9-libavfilter-devel \
ffmpeg-9-libavformat-devel \
ffmpeg-9-libavutil-devel \
ffmpeg-9-libswresample-devel \
ffmpeg-9-libswscale-devel \
libavdevice63 \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
