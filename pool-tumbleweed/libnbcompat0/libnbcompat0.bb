SUMMARY = "NetBSD compatibility library"
DESCRIPTION = "This package holds the shared library of libnbcompat."
LICENSE = "BSD-4-Clause"

PV = "1.0.1"

RPM_NAME = "libnbcompat0-1.0.1-3.12.aarch64.rpm"
RPM_HASH = "f274fd6ba42711cb2f61dac6bb31448bb3755579e370c22f8346dbe32306504c06c0c64d3b6700847cbe5943f058608d95cf5082d4bfe13812c1ca214b31ebf7"

RPROVIDES:${PN} += "libnbcompat.so.0 \
libnbcompat0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
