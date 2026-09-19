SUMMARY = "Library to program and control the FTDI USB controller"
DESCRIPTION = "Library to program and control the FTDI USB controller. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1+ & GPL-2.0-with-classpath-exception"

PV = "0.20"

RPM_NAME = "libftdi1-0.20-2.11.aarch64.rpm"
RPM_HASH = "ac05051c5456bee4378500297067f97c551c1cdf1a7feda221e9103dcf39c1748f74f77d2b0f264540a8f50e8f4c829e5d5895ce27bb9370a4f0b6fc49d570cd"

RPROVIDES:${PN} += "libftdi.so.1 \
libftdi1 \
libftdipp.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-0.1.so.4"

inherit rpm
