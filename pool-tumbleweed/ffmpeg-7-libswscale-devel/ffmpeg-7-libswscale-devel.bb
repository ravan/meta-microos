SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "7.1.5"

RPM_NAME = "ffmpeg-7-libswscale-devel-7.1.5-3.1.aarch64.rpm"
RPM_HASH = "157c89caabcce3a809f3074d2d8b8b68cea162abab75237fa32cb2659a6ca63ede6e1cb5b3992c458e583caacacdaba7140194ea1b23d01d97dc766f490c84a4"

RPROVIDES:${PN} += "ffmpeg-7-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-7-libavutil-devel \
libswscale8 \
pkgconfig-libavutil"

inherit rpm
