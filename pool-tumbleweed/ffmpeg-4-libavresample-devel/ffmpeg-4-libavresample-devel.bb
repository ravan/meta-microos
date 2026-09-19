SUMMARY = "Development files for libavresample as present in FFmpeg"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code. \
 \
This subpackage contains the headers for FFmpeg's copy of libavresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-libavresample-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "b0a6f44a6d0b8421845336a505aea9f2a45582fde2f434b6bde5faca9b81357c8e70fc2c52de3408bf4aba184c06a93fab77f15a7733e88b2e69d9c1c33f6632"

RPROVIDES:${PN} += "ffmpeg-4-libavresample-devel \
libavresample-devel \
pkgconfig-libavresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libavresample4-0 \
pkgconfig-libavutil"

inherit rpm
