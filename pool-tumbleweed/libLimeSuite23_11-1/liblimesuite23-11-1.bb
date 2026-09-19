SUMMARY = "Library for Lime Suite"
DESCRIPTION = "Lime Suite is a collection of software supporting several hardware \
platforms and other tools for developing with LMS7-based hardware."
LICENSE = "Apache-2.0"

PV = "23.11.0"

RPM_NAME = "libLimeSuite23_11-1-23.11.0-4.1.aarch64.rpm"
RPM_HASH = "1b19ef2a036ed62fbe64b7dbf998c603ce330567750e19b99484b67f74ef9747e7a04531a182aa53863b9b61b9e7f6c66f2881fa063eee62491dfe845914374d"

RPROVIDES:${PN} += "libLimeSuite.so.23.11-1 \
libLimeSuite23-11-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0 \
limesuite-udev"

inherit rpm
