SUMMARY = "Documentation for texlive-tabularray-abnt"
DESCRIPTION = "This package includes the documentation for texlive-tabularray-abnt"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn76924"

RPM_NAME = "texlive-tabularray-abnt-doc-2026.227.svn76924-62.2.noarch.rpm"
RPM_HASH = "6279c6fe5b076e304861a5ac3a650d5aa69182bdd32317cd8bb6402d89b72c41046d3a70001d13c4e35df2b28b841c5426acf9e5ded60adca8e8b88e0df38681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabularray-abnt-doc-pt-BR \
texlive-tabularray-abnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
