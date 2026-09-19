SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-libavformat-devel-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "f45977b0d4f5deb15155bd28684303fac8e62791b5a1445e7fcb7f7ba7e76c3ba91483f1c0386ceb48b488d4183a75fd7dac3765e980d42dab5c280e84a1ff86"

RPROVIDES:${PN} += "ffmpeg-7-libavformat-devel \
libavformat-devel \
pkgconfig-libavformat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-7-libavcodec-devel \
ffmpeg-7-libavutil-devel \
ffmpeg-7-libswresample-devel \
libavformat61 \
pkgconfig-libavcodec \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
