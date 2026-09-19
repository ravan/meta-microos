SUMMARY = "libusb-1.0 Compatibility Layer for libusb-0.1"
DESCRIPTION = "A compatibility layer allowing applications written for libusb-0.1 to \
work with libusb-1.0. libusb-compat-0.1 attempts to look, feel, smell \
and walk like libusb-0.1."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "0.1.8"

RPM_NAME = "libusb-compat-devel-0.1.8-38.12.aarch64.rpm"
RPM_HASH = "4122aade4166cdf7e778e530cbcc5d00f3339d1711430437be69ffa0f85b6160a91429c5001893382ee65c09b3052a39847d2f7631849e41418e3cd98fb95b26"

RPROVIDES:${PN} += "libusb-compat-devel \
libusb-devel \
pkgconfig-libusb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libusb-0-1-4 \
libusb-1-0-devel \
libusb-1-0-features-in-0-1-api \
pkgconfig-libusb-1.0"

inherit rpm
