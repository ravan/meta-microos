SUMMARY = "Documentation for powerline"
DESCRIPTION = "This package provides the powerline documentation."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "powerline-docs-2.8.4-3.5.noarch.rpm"
RPM_HASH = "21e283770d4a885ae877691542490516745b19c7ee2a2d3231f21baa405599fb4d9a320794d159878b1468860ec5ac0c9403778e414442c32d8b49804490b337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "powerline-docs"

RDEPENDS:${PN} += ""

inherit rpm
