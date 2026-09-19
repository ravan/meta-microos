SUMMARY = "Documentation for texlive-eltex"
DESCRIPTION = "This package includes the documentation for texlive-eltex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-eltex-doc-2026.226.2.0svn15878-61.4.noarch.rpm"
RPM_HASH = "9844fe9cd8cd464e8d55360c54e9164e5e18096d3dd767eb8f0c5e118c97fa0828117285dbd4c5a022b0610148c3c3c14380177c87e350c98f1f1885fb63f114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eltex-doc-en;cs \
texlive-eltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
