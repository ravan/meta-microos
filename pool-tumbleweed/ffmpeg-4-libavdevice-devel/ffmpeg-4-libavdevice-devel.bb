SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-libavdevice-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "e108b50e4d5240f040f4014b7eb1c6bc32cb1b399736bb1cc9814ff1972b9ac799ebb7f63227300dcbb12fc6881fa3a8ad8c7184a087bef9c72e71b473f5f04e"

RPROVIDES:${PN} += "ffmpeg-4-libavdevice-devel \
ffmpeg-devel \
libavdevice-devel \
pkgconfig-libavdevice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavfilter-devel \
ffmpeg-4-libavformat-devel \
ffmpeg-4-libavresample-devel \
ffmpeg-4-libavutil-devel \
ffmpeg-4-libpostproc-devel \
ffmpeg-4-libswresample-devel \
ffmpeg-4-libswscale-devel \
libavdevice58-13 \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavresample \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
