SUMMARY = "Library for USB Firewall including flex/bison parser"
DESCRIPTION = "Library to read usbauth config file into data structures"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "libusbauth-configparser1-1.0.5-1.14.aarch64.rpm"
RPM_HASH = "a7dc15d673ccd9a03f2e9569d6dde507f9de64cb6f0de75f74595f098b63423c55ff42ff8772e042a7a7118c3316cb94ba422884f5da0e44556a2f2ee6603e4b"

RPROVIDES:${PN} += "libusbauth-configparser.so.1 \
libusbauth-configparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
