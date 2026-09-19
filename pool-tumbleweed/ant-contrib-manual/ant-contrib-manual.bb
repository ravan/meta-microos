SUMMARY = "Manual for ant-contrib"
DESCRIPTION = "Documentation for ant-contrib tasks."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-manual-1.0b3-12.10.noarch.rpm"
RPM_HASH = "ada64bde4ca37a4c7fd2e8463d7eee2a5e9a9e215bb3c56b5edf292e90bbdfaff2f5c6e12ecae57a0a449352a9d9c99885482b478570fefebb8bdaba183963b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib-manual"

RDEPENDS:${PN} += ""

inherit rpm
