SUMMARY = "A lightweight C library for RDF syntax"
DESCRIPTION = "A lightweight C library for RDF syntax which supports reading and writing Turtle and NTriples."
LICENSE = "ISC"

PV = "0.32.10"

RPM_NAME = "libserd-0-0-0.32.10-1.1.aarch64.rpm"
RPM_HASH = "e2b2c93df98340aeabe2f27692355e81f3eaa4ef69f14ded989fcd03e93a74beaad403c59034b71794fce6f6dd1b4a69ed1be30407a86522235c6a52f58a83ea"

RPROVIDES:${PN} += "libserd-0-0 \
libserd-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
