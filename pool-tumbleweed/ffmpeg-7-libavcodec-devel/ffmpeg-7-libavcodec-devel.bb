SUMMARY = "Development files for FFmpeg's codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-libavcodec-devel-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "f90adbd694227487eba667e8dd743f1631d48c85c7fb4f1f452840c62b1bb1cc7478b4886281bd0ffa71988447d68d679367909f1e1c0e97500fbdc57dbe6dcd"

RPROVIDES:${PN} += "ffmpeg-7-libavcodec-devel \
libavcodec-devel \
pkgconfig-libavcodec"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-7-libavutil-devel \
libavcodec61 \
pkgconfig-libavutil \
pkgconfig-libswresample"

inherit rpm
