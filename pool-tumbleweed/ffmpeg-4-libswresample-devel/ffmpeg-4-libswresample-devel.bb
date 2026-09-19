SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-libswresample-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "fd516cb2363cda010a7b5f92069aa13ee39b783a739b0d42e7c9de45ac3b492e087f042485bd3cc22420871a22a78e578790197bd5f4b85dff891f6ae84446fb"

RPROVIDES:${PN} += "ffmpeg-4-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswresample3-9 \
pkgconfig-libavutil"

inherit rpm
