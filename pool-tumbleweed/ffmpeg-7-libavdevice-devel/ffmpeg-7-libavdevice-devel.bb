SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-libavdevice-devel-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "7740220ef59d12ab322684f8f625984a99b7a38753fd7de627f63507eed0ce793dcf465204a4cba306829da9ae504d6ba8517c331d23827ed80961e11e0f8876"

RPROVIDES:${PN} += "ffmpeg-7-libavdevice-devel \
ffmpeg-devel \
libavdevice-devel \
pkgconfig-libavdevice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-7-libavcodec-devel \
ffmpeg-7-libavfilter-devel \
ffmpeg-7-libavformat-devel \
ffmpeg-7-libavutil-devel \
ffmpeg-7-libpostproc-devel \
ffmpeg-7-libswresample-devel \
ffmpeg-7-libswscale-devel \
libavdevice61 \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
