SUMMARY = "Development headers for Boost.Python.NumPy library"
DESCRIPTION = "Development headers for Boost.Python.NumPy library. This package contains \
library for python3 development for boost. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_numpy3-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "581e84394193cab7338e9812b0fe4f4b1d26ec5127f33f51b1020333cf3e75a67043f68d06451e2f976f201a531a9cf83f5f5602cc1599befd24e474a232e242"

RPROVIDES:${PN} += "libboost-numpy3-devel"

RDEPENDS:${PN} += "libboost-numpy-py3-1-91-0-devel"

inherit rpm
