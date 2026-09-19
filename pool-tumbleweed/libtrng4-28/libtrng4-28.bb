SUMMARY = "A Random Number Generator Library"
DESCRIPTION = "TRNG is a C++ pseudo random number generator library. \
 \
Key features: \
* compatible with the C++11 random number facility as defined in \
  <random> \
* implements various pseudo random number algorithms \
* supports multiple streams of random numbers for parallel \
  (multi-threaded) applications \
* may be used with any threading library or MPI \
* pseudo random numbers can be sampled from many different distributions"
LICENSE = "BSD-3-Clause"

PV = "4.28"

RPM_NAME = "libtrng4-28-4.28-1.3.aarch64.rpm"
RPM_HASH = "cfecf45de1b2ad8cf0db46961eb0c50e61b61bd217ceafef91fe17a967e0fcae768f2e41db1744ab2e655082e4854657d88f0ab504b218b6e8cabf3460de5f39"

RPROVIDES:${PN} += "libtrng4-28 \
libtrng4.so.28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
