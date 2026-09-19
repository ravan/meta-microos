SUMMARY = "License and documentation files for mtxclient"
DESCRIPTION = "Client API library for the Matrix protocol, built on top of Boost.Asio."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "mtxclient-doc-0.10.1-1.7.noarch.rpm"
RPM_HASH = "5d3f44a5d1f01d713065de34d4e3251593e82d84f08646ff97c61096ba0a86f63cb1f952589a09cfa1d52f3816a5841898a4848f2a278c4f9eba09e07945540d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mtxclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
