SUMMARY = "Documentation for texlive-ocgx2"
DESCRIPTION = "This package includes the documentation for texlive-ocgx2"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.60svn76924"

RPM_NAME = "texlive-ocgx2-doc-2026.226.0.0.60svn76924-61.2.noarch.rpm"
RPM_HASH = "874b80a8185ddadf72506654f7212e370a09295089734d20ea455c61d75d2036da1f41cea184d57cd6b73ff59c905875db7dc684f8a340047ef147be9e3387ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocgx2-doc"

RDEPENDS:${PN} += ""

inherit rpm
