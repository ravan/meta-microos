SUMMARY = "Library for polynomial arithmetic in Z/nZ[x]"
DESCRIPTION = "zn_poly is a C library for polynomial arithmetic in Z/nZ[x], where n \
is any modulus that fits into an unsigned long."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "libzn_poly-0_9-0.9.2-2.21.aarch64.rpm"
RPM_HASH = "abe45e0e247c077e06c09e819cd7effc0c4ea818c50072f3b19b27ab951ef05a2d8e5b1df1868eb37f82bee43c91fc0c71f548618b7d6f03d71c64f324b86ac1"

RPROVIDES:${PN} += "libzn-poly-0-9 \
libzn-poly-0.9.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
