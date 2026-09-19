SUMMARY = "X Video extension library"
DESCRIPTION = "The X Video Extension (Xv) extension provides support for video \
adaptors attached to an X display. It takes the approach that a \
display may have one or more video adaptors, each of which has one or \
more ports through which independent video streams pass. \
 \
Its use is to rescale video playback, do colorspace conversions, and \
change contrast, brightness and hue using video controller hardware \
acceleration."
LICENSE = "MIT"

PV = "1.0.13"

RPM_NAME = "libXv1-1.0.13-1.7.aarch64.rpm"
RPM_HASH = "fce48c59771a9d000d9b3c3328ad9a7e624f994f14849c4091cd77c8c91dc7bd3678578bfaf0b97f6054424ddd5b306ad0695acf57fec2a93ee9f941c72dcc9d"

RPROVIDES:${PN} += "libXv.so.1 \
libXv1 \
xorg-x11-libXv"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
