SUMMARY = "Documentation for texlive-apa6"
DESCRIPTION = "This package includes the documentation for texlive-apa6"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.35svn67848"

RPM_NAME = "texlive-apa6-doc-2026.226.2.35svn67848-61.2.noarch.rpm"
RPM_HASH = "5b0915625dc5642b64a31000242cfcc085bcfec12aeef0e6a91cc09287e422c82add9e8093a71bf1867e10f77647d1f926ee3061220ac07466d64ce69362f83e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa6-doc"

RDEPENDS:${PN} += ""

inherit rpm
