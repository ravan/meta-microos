SUMMARY = "Driver for HackRF"
DESCRIPTION = "Library to run HackRF, an open source hardware project to build a Software \
Defined Radio (SDR) peripheral."
LICENSE = "GPL-2.0-only"

PV = "2026.01.3"

RPM_NAME = "libhackrf0-2026.01.3-1.4.aarch64.rpm"
RPM_HASH = "48b4e809bd09d231643469ef88a2bc0360b6495b04b6deb21b33eaa56d0989795b227a03d0421ba2585b315d4e3d9bbeb30c5dc18544f55d458663f70d9ef6f2"

RPROVIDES:${PN} += "libhackrf.so.0 \
libhackrf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
hackrf-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
