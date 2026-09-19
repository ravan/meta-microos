SUMMARY = "Package provides recommended R-rpart"
DESCRIPTION = "This packages provides R-rpart, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.1.27"

RPM_NAME = "R-rpart-4.1.27-58.3.aarch64.rpm"
RPM_HASH = "1623033412245a761d1781dd97fea3aebba66b88e8a924aa23b95245971bd64331fa7f443de8ec59d0880cbe6f5279b2291de6f2b1843aad459d4397db83ad81"

RPROVIDES:${PN} += "R-rpart"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
