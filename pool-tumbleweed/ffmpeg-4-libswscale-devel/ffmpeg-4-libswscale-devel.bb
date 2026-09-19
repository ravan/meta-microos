SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.8"

RPM_NAME = "ffmpeg-4-libswscale-devel-4.4.8-5.1.aarch64.rpm"
RPM_HASH = "20f350c23dc40ddde369dfcc54ef0c8eb0aec7fe516ad1139a75bd4b65275e3273300874767e85642739107b995cfa742a8901ca32299ee103b7e7f37441f097"

RPROVIDES:${PN} += "ffmpeg-4-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswscale5-9 \
pkgconfig-libavutil"

inherit rpm
