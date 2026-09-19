SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-libavdevice-devel-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "7ed644112971e93cac42036550c305a527cb1a1b7f6a979e0384a5e6a274548a7a91d0ce96f6d01df462278913c4b731a62745bf79958a3533e84a07990ea914"

RPROVIDES:${PN} += "ffmpeg-8-libavdevice-devel \
ffmpeg-devel \
libavdevice-devel \
pkgconfig-libavdevice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-8-libavcodec-devel \
ffmpeg-8-libavfilter-devel \
ffmpeg-8-libavformat-devel \
ffmpeg-8-libavutil-devel \
ffmpeg-8-libswresample-devel \
ffmpeg-8-libswscale-devel \
libavdevice62 \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
