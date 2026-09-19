SUMMARY = "Development files for the Osmocom USB library"
DESCRIPTION = "The libosmosub library in particular contains routines for USB device \
access via libusb-1.0, integrated into the libosmocore select event loop. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmousb."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmousb-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "7f097ca44ee76e58157acd32a6bec319af0cc825e084f7538b6809f0261847ca40a10fbf6161f19bd84531d3d9c65cd32ca43cd2d818ab08921def29136f8b66"

RPROVIDES:${PN} += "libosmousb-devel \
pkgconfig-libosmousb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmousb0 \
libusb-1-0-devel \
pkgconfig-libosmocore \
pkgconfig-libusb-1.0 \
pkgconfig-talloc"

inherit rpm
