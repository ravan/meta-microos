SUMMARY = "Library for accessing MTP Players"
DESCRIPTION = "This package contains the libraries that allow access to USB based media \
players based on the MTP (Media Transfer Protocol) authored by \
Microsoft. \
 \
Common devices using this technology are Creative Zen, iRiver, Samsung \
and others."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.23"

RPM_NAME = "libmtp9-1.1.23-1.3.aarch64.rpm"
RPM_HASH = "1ccb95614762d7a372143cbd32278eaec77a5a1eb8be41eca1b49217e4cf3f4e02d0c4fe43c03451728925818246af7367cdb18e026a589491e6dabbcad8258c"

RPROVIDES:${PN} += "libmtp.so.9 \
libmtp9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libmtp-udev \
libusb-1.0.so.0"

inherit rpm
