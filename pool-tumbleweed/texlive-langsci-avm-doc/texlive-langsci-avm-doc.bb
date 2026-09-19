SUMMARY = "Documentation for texlive-langsci-avm"
DESCRIPTION = "This package includes the documentation for texlive-langsci-avm"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.0svn76924"

RPM_NAME = "texlive-langsci-avm-doc-2026.226.0.0.4.0svn76924-63.2.noarch.rpm"
RPM_HASH = "ad8b9909bb355e9da36a552e7e61ea657e183950820147f7617ae70a15b24af493a5cd27702f883dfc4e9b5f696e6ebd720511ae383f7cc1a0541ca8709fa22f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langsci-avm-doc"

RDEPENDS:${PN} += ""

inherit rpm
