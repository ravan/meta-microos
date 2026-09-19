SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-libswresample-devel-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "793a2804e2e2d3ba68e1ce762243ffa2cc6dfaca014c8ebfcb10d504e09128a18934de8172cdc2716059d62649f7bdc5ed8c5fa7e9eb3a3272f04cdfa3322fa4"

RPROVIDES:${PN} += "ffmpeg-7-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-7-libavutil-devel \
libswresample5 \
pkgconfig-libavutil"

inherit rpm
