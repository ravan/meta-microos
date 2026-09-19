SUMMARY = "Development files for the X Video extension library"
DESCRIPTION = "The X Video Extension (Xv) extension provides support for video \
adaptors attached to an X display. It takes the approach that a \
display may have one or more video adaptors, each of which has one or \
more ports through which independent video streams pass. \
 \
This package contains the development headers for the library found \
in libXv1."
LICENSE = "MIT"

PV = "1.0.13"

RPM_NAME = "libXv-devel-1.0.13-1.7.aarch64.rpm"
RPM_HASH = "b1b8bcdc265d597dd1cfe429223201350a5577fb94fd226be3f630ad25baf487a8160dcd0f75cd3e45e357db4d2a74c90f8ce79384043808d0dc70c9fcb9e8ca"

RPROVIDES:${PN} += "libXv-devel \
pkgconfig-xv \
xorg-x11-libXv-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXv1 \
pkgconfig-videoproto \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xproto"

inherit rpm
