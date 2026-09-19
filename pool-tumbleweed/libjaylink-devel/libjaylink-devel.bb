SUMMARY = "USB interface library for J-Link -- development files"
DESCRIPTION = "Library for accessing Segger J-Link USB devices. \
 \
This sub-package contains the development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libjaylink-devel-0.3.1-1.13.aarch64.rpm"
RPM_HASH = "570979e7cd760010d4eff1b981cc60833aabc678bdc8e85f326e6d757e0945879bfb902e283c0ce4f0881d24daca923e0c6bf030cb33c7dec994827e3f3d4f08"

RPROVIDES:${PN} += "libjaylink-devel \
pkgconfig-libjaylink"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjaylink0 \
pkgconfig-libusb-1.0"

inherit rpm
