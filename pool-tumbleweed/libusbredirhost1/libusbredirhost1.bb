SUMMARY = "A protocol for redirecting USB traffic - Host-side library"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.15.0"

RPM_NAME = "libusbredirhost1-0.15.0-1.1.aarch64.rpm"
RPM_HASH = "08a260d8a67943237807d748e86472fba2a8fdf6b00cb0faa46bd75c83940f284370c9e4e28ef503454ed6225be9af7bd3f854a7d5be1a68cae6509d2754538e"

RPROVIDES:${PN} += "libusbredirhost.so.1 \
libusbredirhost1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
libusbredirparser.so.1"

inherit rpm
