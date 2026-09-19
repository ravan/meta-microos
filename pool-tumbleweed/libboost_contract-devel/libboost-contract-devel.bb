SUMMARY = "Development headers for Boost.Contract"
DESCRIPTION = "Development headers and libraries for Boost.Contract, a library \
that implements Design by Contract or DbC or contract programming. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_contract-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "fbcc3fbe0fe657b192a8ecda16f45f90465b66f21efd59c68f5b31375b9bc1f82152ebe62e24a323bc8e04f7df9fa5b37df460484003b84ab11ec193c3742a43"

RPROVIDES:${PN} += "libboost-contract-devel"

RDEPENDS:${PN} += "libboost-contract1-91-0-devel"

inherit rpm
