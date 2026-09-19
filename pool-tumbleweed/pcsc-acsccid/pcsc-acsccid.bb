SUMMARY = "PCSC Driver for ACS CCID Based Smart Card Readers"
DESCRIPTION = "This package contains a ACS USB CCID (Chip/Smart Card Interface \
Devices) driver. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.13"

RPM_NAME = "pcsc-acsccid-1.1.13-1.4.aarch64.rpm"
RPM_HASH = "76765115e970c1b88fdce6209cc0bbcfa0739458772e7bf8fc6205b67fe431b87a5002859ac197de67fef8507b3e3c923fd26a893c5a7a4831ebfe674a61d46d"

RPROVIDES:${PN} += "libacsccid.so \
pcsc-acsccid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
pcsc-lite"

inherit rpm
