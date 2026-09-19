SUMMARY = "Development headers for Boost.Contract"
DESCRIPTION = "Development headers and libraries for Boost.Contract, a library \
that implements Design by Contract or DbC or contract programming."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_contract1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "64ceda759c19260bb57614a6af19f5723ecce42ef8340bd6b2d4cd99db85979d2bdf4046462f972d89c5bde195e937a9f4284de2391cc2a3007a816b7bfc5c43"

RPROVIDES:${PN} += "libboost-contract-devel-impl \
libboost-contract1-91-0-devel"

RDEPENDS:${PN} += "libboost-contract1-91-0 \
libboost-headers1-91-0-devel \
libstdc++-devel"

inherit rpm
