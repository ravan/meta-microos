SUMMARY = "Documentation for texlive-arraycols"
DESCRIPTION = "This package includes the documentation for texlive-arraycols"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn71168"

RPM_NAME = "texlive-arraycols-doc-2026.226.1.5svn71168-60.2.noarch.rpm"
RPM_HASH = "8c791fba88d3abd077764b75f4f30aa5f235ac04647befa574257fae59e63996fc821edf3ad544b49d8f77ba935196e96eb07bef35c4ce8dee53e9064bd9005e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arraycols-doc"

RDEPENDS:${PN} += ""

inherit rpm
