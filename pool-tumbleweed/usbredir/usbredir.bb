SUMMARY = "A protocol for redirecting USB traffic"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.15.0"

RPM_NAME = "usbredir-0.15.0-1.1.aarch64.rpm"
RPM_HASH = "e2259958528e8663edd52ea8212ffd0996a1526f2ac8e6434dd4669fdc5841349827ff389207f658cb1de6a178a1875a6b44aa8f72f641d828073977211e679c"

RPROVIDES:${PN} += "usbredir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libusb-1.0.so.0 \
libusbredirhost.so.1"

inherit rpm
