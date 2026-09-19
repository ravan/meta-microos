SUMMARY = "BCUnit shared library"
DESCRIPTION = "BCUnit is a unit testing framework for C. \
This package installs the BCUnit shared library."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4.102"

RPM_NAME = "libbcunit1-5.4.102-1.3.aarch64.rpm"
RPM_HASH = "9a3b154ff4a9464ec099dcf6f660901fc952801433082b12981c22223eba24c24211cca2d1e5a7503712401387cf818be5a3a55ed91fc5acde84d13e44f35b65"

RPROVIDES:${PN} += "libbcunit.so.1 \
libbcunit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
