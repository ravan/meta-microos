SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "ffmpeg-8-libswscale-devel-8.1.2-4.1.aarch64.rpm"
RPM_HASH = "6412bc8a8745cf994d6d8de5500af10332a2066ffab5aa076198abb010a7018f9be3112a8ff1c9545f01bf992200a7ab93a12a515ca4d81ae44c0a7105dfca22"

RPROVIDES:${PN} += "ffmpeg-8-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-8-libavutil-devel \
libswscale9 \
pkgconfig-libavutil"

inherit rpm
