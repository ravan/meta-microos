SUMMARY = "Library for creating and verifying Usenet cancel locks"
DESCRIPTION = "libcanlock is a library for creating and verifying RFC 8315 Netnews \
Cancel-Locks. This implementation uses the recommended algorithm from \
Section 4 with HMAC based on the same hash function as <scheme>. \
 \
This subpackage contains shared library part of libcanlock."
LICENSE = "MIT & NLPL"

PV = "3.3.3"

RPM_NAME = "libcanlock3-3.3.3-1.2.aarch64.rpm"
RPM_HASH = "dbd831eab933f257c3742cc034dbd36f91fa367abfd999403c58b9dc2a0349a61f9c1f4a3c333e098df9142ec71d988642423e3456a6ab09dabbd6b90d0d223a"

RPROVIDES:${PN} += "libcanlock-hp.so.3 \
libcanlock.so.3 \
libcanlock3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
