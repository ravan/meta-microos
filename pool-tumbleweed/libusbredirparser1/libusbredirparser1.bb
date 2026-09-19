SUMMARY = "A protocol for redirecting USB traffic - Client-side library"
DESCRIPTION = "usbredir is a protocol for redirecting USB traffic from a single USB device, \
to a different (virtual) machine than the one to which the USB device is \
attached. See usb-redirection-protocol.md for the description / definition \
of this protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.15.0"

RPM_NAME = "libusbredirparser1-0.15.0-1.1.aarch64.rpm"
RPM_HASH = "1d7da7132fcc859562cca1a809a59eba0c7d5ca9a3124cbd909bb65587a7f19a8ecbef6847c3e61cbfc8b25176d57f7ff9331238eba69c24168d2932d2b7261e"

RPROVIDES:${PN} += "libusbredirparser.so.1 \
libusbredirparser0 \
libusbredirparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
