SUMMARY = "Development headers for Boost.Random library"
DESCRIPTION = "This package contains Boost.Random development headers."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_random1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f40ce4b0d282f65127815248a197fc44cc552e40051658fe4b61e0d23d10e7a0daa43ffda21795ab8dee59118652b8c2682ea9bd42c853d145a1ac44b56666e4"

RPROVIDES:${PN} += "libboost-random-devel-impl \
libboost-random1-91-0-devel"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel \
libboost-random1-91-0"

inherit rpm
