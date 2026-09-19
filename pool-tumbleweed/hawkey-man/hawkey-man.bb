SUMMARY = "Documentation for the hawkey Python bindings"
DESCRIPTION = "This package provides the man pages for the hawkey Python bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.75.0"

RPM_NAME = "hawkey-man-0.75.0-1.3.noarch.rpm"
RPM_HASH = "d52d93bbff698031cccc7b7e678ab45552c1873d8ee13f9d442db8ab5af566747c6bc852f878d46db2213ad84038f9448aed922de39c6489992731cc19679682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hawkey-man"

RDEPENDS:${PN} += ""

inherit rpm
