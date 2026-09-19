SUMMARY = "Industrial I/O library"
DESCRIPTION = "Library for industrial I/O."
LICENSE = "LGPL-2.1-or-later"

PV = "0.26"

RPM_NAME = "libiio0-0.26-1.10.aarch64.rpm"
RPM_HASH = "b12ea8e7b9eff6c763f812449a779ed9219068ef686f8d41900894dfa507c7adab6eb5d449a9e644a989093115a1976439690c6f745ed2d2034ee3c3d3e83cb6"

RPROVIDES:${PN} += "libiio.so.0 \
libiio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libusb-1.0.so.0 \
libxml2.so.16"

inherit rpm
