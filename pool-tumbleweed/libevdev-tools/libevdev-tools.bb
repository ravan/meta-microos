SUMMARY = "Library for handling evdev kernel devices"
DESCRIPTION = "Library for handling evdev kernel devices. It abstracts the ioctls \
through type-safe interfaces and provides functions to change \
the appearance of the device. \
 \
Aditional utilities for libevdev library"
LICENSE = "MIT"

PV = "1.13.7"

RPM_NAME = "libevdev-tools-1.13.7-1.1.aarch64.rpm"
RPM_HASH = "2fc1c9bb962425ac244cd5cd48cb54da8d0002c1357e8049b53e8109bac537e4878ff02c1d28517d1f8604fe054b8a58cb6cfa427e9b5f3602dbde7285da0085"

RPROVIDES:${PN} += "libevdev-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2"

inherit rpm
