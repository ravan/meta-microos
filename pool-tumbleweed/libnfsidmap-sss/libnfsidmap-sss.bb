SUMMARY = "Library to allow communication between libnfsidmap and SSSD"
DESCRIPTION = "A utility library to allow communication between libnfsidmap and SSSD."
LICENSE = "GPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "libnfsidmap-sss-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "2ce9975e09965280721dd5f840ffaa7bd12ac64383bc387c1659a81798506b22d80524e814f7c6e2bc61ffa16e81015fb984435bbf13518742d19da9c949b054"

RPROVIDES:${PN} += "libnfsidmap-sss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfsidmap.so.1"

inherit rpm
