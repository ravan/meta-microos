SUMMARY = "Documentation for texlive-rjlparshap"
DESCRIPTION = "This package includes the documentation for texlive-rjlparshap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-doc-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "0bf181f10f2260e46e40bcdcb9feebd076572b2061d3af89b1ca906ab80293a85e618abe4f39f4bba87504cbc9aefeb3c46dadab26adede50e3709d8e0618739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rjlparshap-doc"

RDEPENDS:${PN} += ""

inherit rpm
