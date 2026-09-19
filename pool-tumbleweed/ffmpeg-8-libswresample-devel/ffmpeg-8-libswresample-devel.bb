SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-libswresample-devel-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "0506ec559b1c16c598ca4ce460205779d666f8e7b4d9d63953f5bd1d7a7e3e97d0d383474694380592ce2bcb156040d8130048649c656158930c8223c46f4c64"

RPROVIDES:${PN} += "ffmpeg-8-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-8-libavutil-devel \
libswresample6 \
pkgconfig-libavutil"

inherit rpm
