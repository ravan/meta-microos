SUMMARY = "Library for handling evdev kernel devices"
DESCRIPTION = "Library for handling evdev kernel devices. It abstracts the ioctls \
through type-safe interfaces and provides functions to change \
the appearance of the device."
LICENSE = "MIT"

PV = "1.13.7"

RPM_NAME = "libevdev2-1.13.7-1.1.aarch64.rpm"
RPM_HASH = "ff1d931ccbe269100f8dcb858c0a8dc1f7e4e744808dd4b6a2ead4aa608c41ef2ef118d645fe38f26c79c7319c0e634deb6257bafef6543a48049593840c29e1"

RPROVIDES:${PN} += "libevdev.so.2 \
libevdev2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
