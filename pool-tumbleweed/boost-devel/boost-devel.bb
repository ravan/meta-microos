SUMMARY = "Development headers for Boost"
DESCRIPTION = "Default version of Boost headers"
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "boost-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "caedcd32c60bb40f9a91b842d8718e3659ea5f9594a3e9675b38cc83c50585119b41e744c22c42add02a667c5d2ec475ae9d24977149270587862911ac1a8d8d"

RPROVIDES:${PN} += "boost-devel"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel"

inherit rpm
