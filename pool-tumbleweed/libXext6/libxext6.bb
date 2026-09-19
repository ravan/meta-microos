SUMMARY = "Common extensions to the X11 protocol"
DESCRIPTION = "The Xext library contains a handful of X11 extensions: \
- Double Buffer extension (DBE/Xdbe) \
- Display Power Management Signaling (DPMS) extension \
- X11 Nonrectangular Window Shape extension (Xshape) \
- The MIT Shared Memory extension (MIT-SHM/Xshm) \
- TOG-CUP (colormap) protocol extension (Xcup) \
- X Extended Visual Information extension (XEvi) \
- X11 Double-Buffering, Multi-Buffering, and Stereo extension (Xmbuf)"
LICENSE = "MIT"

PV = "1.3.7"

RPM_NAME = "libXext6-1.3.7-1.4.aarch64.rpm"
RPM_HASH = "2ac26d0c8ddf8ef952eddc58c02561ba0f1036f631a1b0b144341c224c3bfb54e7f259a37df7d85fd2082358a60ce900d6242306cf3cb7b21dada22934507c97"

RPROVIDES:${PN} += "libXext.so.6 \
libXext6 \
xorg-x11-libXext"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
