SUMMARY = "Documentation for texlive-rest-api"
DESCRIPTION = "This package includes the documentation for texlive-rest-api"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn57068"

RPM_NAME = "texlive-rest-api-doc-2026.226.1.4svn57068-60.4.noarch.rpm"
RPM_HASH = "a5cac4ff7193d661c551ceb3ee7732ffb69c7ecdcabf07906ac1fbe4552cb6a426c231b74d6f239f9dc95821b8c83e490f8c4f7b610f833eed5abd39b21002fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rest-api-doc"

RDEPENDS:${PN} += ""

inherit rpm
