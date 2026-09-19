SUMMARY = "Development headers for Boost.Thread library"
DESCRIPTION = "This package contains development headers for Boost.Thread library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_thread-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "c37e078ec6289e7e993ff41f3a02d004790ed831e24f2ecc56eb8bb220e1a35719e509ab7deff92d205c22a0c119fed7c30ea20ca15dc3363b2db8655724ea60"

RPROVIDES:${PN} += "libboost-thread-devel"

RDEPENDS:${PN} += "libboost-thread1-91-0-devel"

inherit rpm
