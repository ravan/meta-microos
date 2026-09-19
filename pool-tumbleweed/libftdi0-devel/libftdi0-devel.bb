SUMMARY = "Header files and static libraries for libftdi"
DESCRIPTION = "Header files and static libraries for libftdi. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1+ & GPL-2.0-with-classpath-exception"

PV = "0.20"

RPM_NAME = "libftdi0-devel-0.20-2.11.aarch64.rpm"
RPM_HASH = "a15c71a6871b3bed35298d45b61f63e3f1d08ad34d8ea674dad782e91db573a6b8010c4dd80a2cb70eeec006993aa9a4abfe8aefa49102cff450ad7716def374"

RPROVIDES:${PN} += "libftdi0-devel \
pkgconfig-libftdi \
pkgconfig-libftdipp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libftdi1 \
libusb-compat-devel \
pkgconfig-libftdi"

inherit rpm
