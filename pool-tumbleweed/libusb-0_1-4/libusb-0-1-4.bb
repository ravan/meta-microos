SUMMARY = "libusb-1.0 Compatibility Library for libusb-0.1"
DESCRIPTION = "A compatibility layer allowing applications written for libusb-0.1 to \
work with libusb-1.0. libusb-compat-0.1 attempts to look, feel, smell \
and walk like libusb-0.1."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "0.1.13"

RPM_NAME = "libusb-0_1-4-0.1.13-38.12.aarch64.rpm"
RPM_HASH = "c601018e27cd4395a974e62492f317e772c2e70a599949df172e9ea4cf2b73ca4d08b0e1024c564b70d03ac558e2c6a82604466ad729bd944007c06095ab8072"

RPROVIDES:${PN} += "libusb \
libusb-0-1-4 \
libusb-0.1.so.4 \
libusb-1-0-features-in-0-1-api"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
