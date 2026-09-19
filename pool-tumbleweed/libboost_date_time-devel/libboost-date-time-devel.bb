SUMMARY = "Development headers for Boost.DateTime library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.DateTime library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_date_time-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "a3deb6bbae3b570e806635b738b8534767e737e3578feb04263272e3ed275ff04c1c6199df0e802b77a60d2fbc739fe4814a7899b9e42fa1595bb1f8880acf80"

RPROVIDES:${PN} += "libboost-date-time-devel"

RDEPENDS:${PN} += "libboost-date-time1-91-0-devel"

inherit rpm
