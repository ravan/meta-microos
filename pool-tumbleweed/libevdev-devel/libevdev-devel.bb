SUMMARY = "Development files for libevdev library"
DESCRIPTION = "Library for handling evdev kernel devices. It abstracts the ioctls \
through type-safe interfaces and provides functions to change \
the appearance of the device. \
 \
Development files for libevdev library"
LICENSE = "MIT"

PV = "1.13.7"

RPM_NAME = "libevdev-devel-1.13.7-1.1.aarch64.rpm"
RPM_HASH = "f7f051bff0947ac0b36a596d23ae133011d79422fdc1fe2629a5a570d354ce630502bcf538a64495b1d50b83a20083e2a129e355a35236bf2cfb8614e832af07"

RPROVIDES:${PN} += "libevdev-devel \
pkgconfig-libevdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libevdev2"

inherit rpm
