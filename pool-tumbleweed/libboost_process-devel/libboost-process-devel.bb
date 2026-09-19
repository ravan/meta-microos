SUMMARY = "Development headers for Boost.Process library"
DESCRIPTION = "This package contains development headers for Boost.Process \
library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_process-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "9bfbedba2a53b815d87859749590180d463efff470ed7be484c266cb74c97d04f15f5ab36644bba2a882c3868182c4dae0eb3b15993cdcc72f556d0911b3fdb8"

RPROVIDES:${PN} += "libboost-process-devel"

RDEPENDS:${PN} += "libboost-process1-91-0-devel"

inherit rpm
