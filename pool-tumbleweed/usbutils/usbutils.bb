SUMMARY = "Tools and libraries for USB devices"
DESCRIPTION = "This package contains a utility for inspecting devices connected to USB \
ports."
LICENSE = "GPL-2.0-or-later"

PV = "019"

RPM_NAME = "usbutils-019-1.5.aarch64.rpm"
RPM_HASH = "7e01b42d9f78c9eb9aeca0be8d3a99d1a76086016074818cb0dd8e3459f4fc05fa53fed6ecc7be24f38edfd6da59eb3dc4b1a6b9d3a645bffe9223a38066c81e"

RPROVIDES:${PN} += "usbutils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
hwdata \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
libusb-1.0.so.0"

inherit rpm
