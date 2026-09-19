SUMMARY = "Development headers for Boost.Serialization library"
DESCRIPTION = "This package contains development headers for Boost.Serialization \
library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_serialization-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "86d162c8e4f27fa8780c7951d5addc083c589a4f661af8defaed037046cd22b294811e7042aff61148e43506bddc68c9eae06d09434594b148b4e8051721cd36"

RPROVIDES:${PN} += "libboost-serialization-devel"

RDEPENDS:${PN} += "libboost-serialization1-91-0-devel"

inherit rpm
