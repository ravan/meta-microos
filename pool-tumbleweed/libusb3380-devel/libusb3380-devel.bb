SUMMARY = "Development files for libusb3380"
DESCRIPTION = "USB3380 abstraction layer for libusb. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libusb3380."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20190126"

RPM_NAME = "libusb3380-devel-0.0.0+git.20190126-3.8.aarch64.rpm"
RPM_HASH = "1b7c5c363f570dbe801e13e62ab1863f1ca20b79f730f6f82ad22c4b4030879a6248e91acc29b15fee2c46705437d1b284742940576ecd9fc20cfc92d630a567"

RPROVIDES:${PN} += "libusb3380-devel \
pkgconfig-libusb3380"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusb3380-0 \
pkgconfig-libusb \
pkgconfig-libusb-1.0"

inherit rpm
