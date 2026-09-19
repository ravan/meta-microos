SUMMARY = "Development files for FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
This subpackage contains the headers for FFmpeg libavformat."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9-libavformat-devel-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "595370b829166aa89fdeea68a9856af0a5210b3fba5049f69f2e54637ced8cbe009f9a0a0ddadf61525e1d6c75c93e2cd93b3e459a7f30dfeaf9dffd8d85b707"

RPROVIDES:${PN} += "ffmpeg-9-libavformat-devel \
libavformat-devel \
pkgconfig-libavformat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-9-libavcodec-devel \
ffmpeg-9-libavutil-devel \
ffmpeg-9-libswresample-devel \
libavformat63 \
pkgconfig-libavcodec \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
