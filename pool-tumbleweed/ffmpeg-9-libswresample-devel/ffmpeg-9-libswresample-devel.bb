SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9-libswresample-devel-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "5df00dc690ca440a5dd15ca9624894116fa67c0ab8abb27891d5a1ef5078c19a0e9043b3f06feddb520bd46d32b220fbb0e7866b19d0bdd9ef0e9f6738cb98b3"

RPROVIDES:${PN} += "ffmpeg-9-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-9-libavutil-devel \
libswresample7 \
pkgconfig-libavutil"

inherit rpm
