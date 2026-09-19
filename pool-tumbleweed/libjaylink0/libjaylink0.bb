SUMMARY = "USB interface library for J-Link"
DESCRIPTION = "Library for accessing Segger J-Link USB devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libjaylink0-0.3.1-1.13.aarch64.rpm"
RPM_HASH = "29f1c02c5e3d3af331c33cfe52d762d3413286dd8f3db285146080711edc81c9c496d1453bf1c7e9756f0250b2ebcdd2a19f12e0c4439993bad7bc30c693ee5d"

RPROVIDES:${PN} += "libjaylink.so.0 \
libjaylink0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
