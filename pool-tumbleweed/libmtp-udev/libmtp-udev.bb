SUMMARY = "Udev rules for accessing MTP devices"
DESCRIPTION = "This package contains the udev rules that allow access to USB based media \
players based on the MTP (Media Transfer Protocol) authored by \
Microsoft."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.23"

RPM_NAME = "libmtp-udev-1.1.23-1.3.aarch64.rpm"
RPM_HASH = "ae1dfdcbacc0a8c38221aa8c421fb960fb3252a8bde570425a6e598d2003c697af06a4711f3ac09c00d194a059165065b53dde5bb971869b071f332f3ec7ae29"

RPROVIDES:${PN} += "libmtp-udev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmtp.so.9 \
pkgconfig-udev"

inherit rpm
