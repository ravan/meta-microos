SUMMARY = "Development files for the X11 Common Extensions library"
DESCRIPTION = "The Xext library contains a handful of X11 extensions: \
- Double Buffer extension (DBE/Xdbe) \
- Display Power Management Signaling (DPMS) extension \
- X11 Nonrectangular Window Shape extension (Xshape) \
- The MIT Shared Memory extension (MIT-SHM/Xshm) \
- TOG-CUP (colormap) protocol extension (Xcup) \
- X Extended Visual Information extension (XEvi) \
- X11 Double-Buffering, Multi-Buffering, and Stereo extension (Xmbuf) \
 \
This package contains the development headers for the library found \
in libXext6."
LICENSE = "MIT"

PV = "1.3.7"

RPM_NAME = "libXext-devel-1.3.7-1.4.aarch64.rpm"
RPM_HASH = "60de4aa8a2a1c0a5058ddb4f0259fb9d340a20f5440ef25de7c3fd9a8772ced2d01c95bb02a0b8561dbd046f901b1bacbbe9bc921cea824627f6878ec1ed43d5"

RPROVIDES:${PN} += "libXext-devel \
pkgconfig-xext \
xorg-x11-libXext-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXext6 \
pkgconfig-x11 \
pkgconfig-xextproto"

inherit rpm
