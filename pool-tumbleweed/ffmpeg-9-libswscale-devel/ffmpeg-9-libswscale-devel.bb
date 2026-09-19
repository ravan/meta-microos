SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "9.0.1"

RPM_NAME = "ffmpeg-9-libswscale-devel-9.0.1-5.1.aarch64.rpm"
RPM_HASH = "6e52feff8a7ed7a153ed4044d2ae1a710ab6468d2285baad5f740b180c7c1288c3c339cf2f9b5e000b39fc1ea66be5903adc174a689e939cfd7ad7fbe33938e4"

RPROVIDES:${PN} += "ffmpeg-9-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-9-libavutil-devel \
libswscale10 \
pkgconfig-libavutil"

inherit rpm
