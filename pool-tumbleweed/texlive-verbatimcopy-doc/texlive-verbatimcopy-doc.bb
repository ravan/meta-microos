SUMMARY = "Documentation for texlive-verbatimcopy"
DESCRIPTION = "This package includes the documentation for texlive-verbatimcopy"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.06svn15878"

RPM_NAME = "texlive-verbatimcopy-doc-2026.226.0.0.06svn15878-60.2.noarch.rpm"
RPM_HASH = "113a6872e277d00e4893b42a8fa9407f58d08bd84134ab1a77a6a954fd8bbeb870193a6aba1f69639529ddb95b6596d238410b931c51bf32f27838cc2c8602bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbatimcopy-doc"

RDEPENDS:${PN} += ""

inherit rpm
