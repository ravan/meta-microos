SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-libavcodec-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "d0ef5bc6eb406ccb3c2100c8e8a507ae650cd78f1d9bafceb17c1800ea7e71f6b3d6f76635a3444719ce5087a229bdd31215374245df5f4371edd112f8a5a8b9"

RPROVIDES:${PN} += "ffmpeg-4-libavcodec-devel \
libavcodec-devel \
pkgconfig-libavcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavresample-devel \
ffmpeg-4-libavutil-devel \
libavcodec58-134 \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
