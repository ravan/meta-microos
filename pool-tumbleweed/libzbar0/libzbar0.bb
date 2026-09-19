SUMMARY = "Bar code reading library"
DESCRIPTION = "ZBar reads bar codes from various sources, such as video streams, \
image files and raw intensity sensors. It supports many symbologies \
(types of bar codes) including EAN-13/UPC-A, UPC-E, EAN-8, Code 128, \
Code 39, Interleaved 2 of 5 and QR Code. \
 \
This package provides the ZBar library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.23.93"

RPM_NAME = "libzbar0-0.23.93-4.3.aarch64.rpm"
RPM_HASH = "6586d74bde12482360db1d9bde1796229a4bc788650de336eca7d86d98b82e53b68de8de3926aa2d8d662986f579a52d32e2a62b3ae1c66f20ba0f7f87e633d8"

RPROVIDES:${PN} += "libzbar.so.0 \
libzbar0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXv.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libjpeg.so.8 \
libv4l2.so.0"

inherit rpm
