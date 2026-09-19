SUMMARY = "Library to generate UUIDs"
DESCRIPTION = "A library to generate universally unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.42.2"

RPM_NAME = "libuuid1-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "f34f69d674e22989fda052ecda39260fbd416812494ac3e40a78ae5e631a6e64f9c1a609ab51f2e10da76e87d73d43d485816460ba674b4c5a91911172a6d5d7"

RPROVIDES:${PN} += "libuuid--uuid-generate-time-cont \
libuuid.so.1 \
libuuid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
