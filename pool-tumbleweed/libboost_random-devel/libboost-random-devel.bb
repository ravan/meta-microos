SUMMARY = "Development headers for Boost.Random library"
DESCRIPTION = "This package contains Boost.Random development headers. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_random-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "a27bad18612deb5c5e708799ef2b4d186a71db9ca3819f735d3293fb98498b73fde8478c1f5c9f6d7572a500110cff4870d4c8f57bd509a0822c9828f0caa20c"

RPROVIDES:${PN} += "libboost-random-devel"

RDEPENDS:${PN} += "libboost-random1-91-0-devel"

inherit rpm
