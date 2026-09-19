SUMMARY = "Osmocom USB library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmosub library in particular contains routines for USB device \
access via libusb-1.0, integrated into the libosmocore select event loop."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmousb0-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "20697b325a52eb814d99e754a6f7a93ea5325c48781df6670aa9bc2b0db6535b20765e161ea68c2eb6cd55b9b27d0bd3c3ab87096f8da69d72614c5bc45cfd9f"

RPROVIDES:${PN} += "libosmousb.so.0 \
libosmousb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libtalloc.so.2 \
libusb-1.0.so.0"

inherit rpm
