SUMMARY = "Seat management daemon"
DESCRIPTION = "Seat management takes care of mediating access to shared devices (graphics, input), without requiring the applications needing access to be root."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "seatd-0.9.3-1.3.aarch64.rpm"
RPM_HASH = "1afa07bdf834543ffd934d878ace2352d31403a5975fc1146a26f22d2a4496a8375a0762d1f9a25bd6091186a1772fc7f7869d3f540115a62f46c000dbe1f859"

RPROVIDES:${PN} += "seatd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libseat1"

inherit rpm
