SUMMARY = "MPC multiple-precision complex library development files"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with arbitrarily high precision and correct rounding of the \
result.  This package contains the library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw32-mpc-devel-1.0.2-3.9.noarch.rpm"
RPM_HASH = "c5ac539c0db4e34457fe6e8d7a0e9703e893f52840ebbd04fc3194c590ce16d9ce2bd872ad520fc55a703751a8450fc9926f457c7e61f4fb22ccbad02108b01a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-mpc \
mingw32-mpc-devel"

RDEPENDS:${PN} += "mingw32-lib-mpfr"

inherit rpm
