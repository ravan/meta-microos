SUMMARY = "Documentation for texlive-locality"
DESCRIPTION = "This package includes the documentation for texlive-locality"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn20422"

RPM_NAME = "texlive-locality-doc-2026.226.0.0.2svn20422-61.2.noarch.rpm"
RPM_HASH = "0ae512cf1c266fb7b3c15ed6c3f39f0ebf252aa3d990c4075d20d7a6dbdce3097d63ef96573d3a3375b83944ddb50e964d3aebef6db3bca76e4bfa98df85ee19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-locality-doc"

RDEPENDS:${PN} += ""

inherit rpm
