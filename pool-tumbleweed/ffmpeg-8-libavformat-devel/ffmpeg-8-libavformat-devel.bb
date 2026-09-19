SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-libavformat-devel-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "f9b63243ecd8200558eeaee5f9aa9f4028431840b6ee6326d2866e156b23b535219da606d377a169b0b7a6f92a4feda75c7123486205406b9ffee518781748c3"

RPROVIDES:${PN} += "ffmpeg-8-libavformat-devel \
libavformat-devel \
pkgconfig-libavformat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-8-libavcodec-devel \
ffmpeg-8-libavutil-devel \
ffmpeg-8-libswresample-devel \
libavformat62 \
pkgconfig-libavcodec \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
