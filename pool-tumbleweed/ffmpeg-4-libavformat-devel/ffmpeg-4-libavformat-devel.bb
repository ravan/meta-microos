SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-libavformat-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "b818856a7ac76b6b1d561e0949a7dfe926c25c1df9e6757a195c31b2906e242c051bbcc696ca8cedf3933e1a6a901c76541273e44d54ca165b417aab8d2b8d6f"

RPROVIDES:${PN} += "ffmpeg-4-libavformat-devel \
libavformat-devel \
pkgconfig-libavformat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavutil-devel \
ffmpeg-4-libswresample-devel \
libavformat58-76 \
pkgconfig-libavcodec \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
