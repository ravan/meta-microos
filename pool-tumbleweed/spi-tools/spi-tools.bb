SUMMARY = "A set of SPI tools for Linux"
DESCRIPTION = "This package contains some simple command line tools to help using Linux \
spidev devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "spi-tools-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "3dcf5fb31bf2116e5c6122d3f0b763b093312c03c101ad71c358db0ff9c6205f3d73b28a000d7ff4f0991583e5d7f2784bc1e6259263d2eb0ff738b19fffd234"

RPROVIDES:${PN} += "spi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
udev"

inherit rpm
