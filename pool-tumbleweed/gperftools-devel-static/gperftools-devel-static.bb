SUMMARY = "Static libraries for performance tools for C++"
DESCRIPTION = "The gperftools-devel-static package contains static libraries for developing \
applications that use the gperftools package."
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "gperftools-devel-static-2.18.1-1.4.aarch64.rpm"
RPM_HASH = "765dc0e9b99124d9248acca6623db32d9f697ce5a536e24ef63f0b2315195294d640644ad22c1649b5f2765916884d036a9101c2d84a2dfacb6ebb429e35d87c"

RPROVIDES:${PN} += "gperftools-devel-static"

RDEPENDS:${PN} += "gperftools-devel"

inherit rpm
