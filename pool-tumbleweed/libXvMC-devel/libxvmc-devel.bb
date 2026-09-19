SUMMARY = "Development files for the X-Video Motion Compensation library"
DESCRIPTION = "X-Video Motion Compensation (XvMC), is an extension of the X video \
extension (Xv) for the X Window System. The XvMC API allows video \
programs to offload portions of the video decoding process to the GPU \
video-hardware. \
 \
This package contains the development headers for the library found \
in libXvMC1."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXvMC-devel-1.0.15-1.4.aarch64.rpm"
RPM_HASH = "68444ce0737f7661a6748da607941d0be22ef332a241f3fe25b8ff48d5339fef85da1b47d8d569caaeb4f3825da7ba44860775a217d0583cf1b027c476d3a7da"

RPROVIDES:${PN} += "libXvMC-devel \
pkgconfig-xvmc \
pkgconfig-xvmc-wrapper \
xorgproto-devel-/usr/include/X11/extensions/vldXvMC.h"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXvMC1 \
pkgconfig-videoproto \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xextproto \
pkgconfig-xv"

inherit rpm
