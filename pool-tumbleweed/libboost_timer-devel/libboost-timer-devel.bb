SUMMARY = "Development headers for Boost.Timer library"
DESCRIPTION = "This package contains development headers for Boost.Timer library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_timer-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "eeb64afc6ba5b3fc00b3b9fedc31e58f340786544bba46d2d690b45023fb17d20327f909604f90d03b92fa66dcb1a8ee31ce6d6a749137aba1bfc77bd7bfaa37"

RPROVIDES:${PN} += "libboost-timer-devel"

RDEPENDS:${PN} += "libboost-timer1-91-0-devel"

inherit rpm
