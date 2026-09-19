SUMMARY = "Development headers for Boost.Coroutine"
DESCRIPTION = "This package provides headers for Boost.Coroutine libraries. \
Boost.Coroutine2 provides templates for generalized subroutines which \
allow suspending and resuming execution at certain locations. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_coroutine-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "cf14170c5c7c6e6f1d3ed8aaee91578a32661b5c3166fcbbcc406236b59231e6245d03c4dedaac1e9c8445ec451a01011bbad4dbac1712bc6556c5252643d36a"

RPROVIDES:${PN} += "libboost-coroutine-devel"

RDEPENDS:${PN} += "libboost-coroutine1-91-0-devel"

inherit rpm
