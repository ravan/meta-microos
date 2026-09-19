SUMMARY = "Development headers for Boost.Test library"
DESCRIPTION = "Development headers for Boost.Test library. Boost.Test supports for \
simple program testing, full unit testing, and for program execution \
monitoring."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_test1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f3f7f77df297f4b67f318cf3de385a524ea10431acd0ba565cb1121859903f3c4c745556d1a00847a69e69b1021b544010b77aa22fd2852b65b24e124265c059"

RPROVIDES:${PN} += "libboost-test-devel-impl \
libboost-test1-91-0-devel"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel \
libboost-regex1-91-0-devel \
libboost-test1-91-0"

inherit rpm
