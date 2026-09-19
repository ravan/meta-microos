SUMMARY = "Documentation for texlive-bxenclose"
DESCRIPTION = "This package includes the documentation for texlive-bxenclose"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn40213"

RPM_NAME = "texlive-bxenclose-doc-2026.226.0.0.2svn40213-59.2.noarch.rpm"
RPM_HASH = "b8511566fbc9f56dbbbbdd8f0af4d0703bbfeed8519239035d1ca4cb52a7454efa5c17c18f0e413ccf888b2f2f99480d02c9f1bc77791c5345293c6c86161761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxenclose-doc"

RDEPENDS:${PN} += ""

inherit rpm
