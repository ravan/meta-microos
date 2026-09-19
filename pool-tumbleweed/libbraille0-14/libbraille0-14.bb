SUMMARY = "Access to Braille Displays and Terminals"
DESCRIPTION = "Libbraille is a computer shared library which makes it possible to \
develop for Braille displays. It provides an API to \
write text on the display, directly draw dots, or get the value of \
keys pressed on the Braille keyboard."
LICENSE = "LGPL-2.1-only"

PV = "0.19.0"

RPM_NAME = "libbraille0-14-0.19.0-26.8.aarch64.rpm"
RPM_HASH = "388840fa336654c63c92698227f29cf515cfa5054f73c06589c0c837e1614c276486c987b3d3fce5de885f646e0b5e63dcc14ddd1629f2eaef94ca10c6283dab"

RPROVIDES:${PN} += "libbraille-0.so.14 \
libbraille0-14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4"

inherit rpm
