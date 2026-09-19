SUMMARY = "Docs for pdnsd"
DESCRIPTION = "This package provides various text files for pdnsd"
LICENSE = "GPL-3.0-or-later"

PV = "1.2.9a"

RPM_NAME = "pdnsd-doc-1.2.9a-12.12.noarch.rpm"
RPM_HASH = "70e246c494f2273f96093dbde278a0a9351339a4c64b62941243b3b6917f66f1580a8ac571bfb036c53b8f653f91025465e3280eb88fdeb734d442499cc70b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdnsd-doc"

RDEPENDS:${PN} += "pdnsd"

inherit rpm
