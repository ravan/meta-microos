SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9-libavcodec-devel-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "58143fd0311d233494f07ec78cf1e6587194eed5c6b444251421e3006814ea4fa09213415b9f7e06bd76c3a68316b7a04df10eba13a9194ab83d289d43ae47f8"

RPROVIDES:${PN} += "ffmpeg-9-libavcodec-devel \
libavcodec-devel \
pkgconfig-libavcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-9-libavutil-devel \
libavcodec63 \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
