SUMMARY = "Package providing R-utils"
DESCRIPTION = "This package provides R-utils, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-utils-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "dfc039204dd23208225e84427b6205ffa84fd419d8f5a4827fda590b72f9c1da91740b6c6c74a89d64b4c104e8e807a57550f1597d9ba824906ecf2da98a4653"

RPROVIDES:${PN} += "R-utils"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
