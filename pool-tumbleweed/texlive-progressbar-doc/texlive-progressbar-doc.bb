SUMMARY = "Documentation for texlive-progressbar"
DESCRIPTION = "This package includes the documentation for texlive-progressbar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0b_4svn33822"

RPM_NAME = "texlive-progressbar-doc-2026.226.1.0b_4svn33822-59.2.noarch.rpm"
RPM_HASH = "0ff52c9d7add3431210d9cf02d9de5fa951a24c11d88fc72ae6ce467ee5ae24c1f9b00d5e029bf65abc731065ff488962cc196349e3825dc4ab7bfc38f35cf01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-progressbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
