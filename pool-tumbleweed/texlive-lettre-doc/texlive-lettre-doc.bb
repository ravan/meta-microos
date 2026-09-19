SUMMARY = "Documentation for texlive-lettre"
DESCRIPTION = "This package includes the documentation for texlive-lettre"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.002svn54722"

RPM_NAME = "texlive-lettre-doc-2026.226.3.002svn54722-61.2.noarch.rpm"
RPM_HASH = "8739bdee76be5ad9f7d2ed7bf45c6b3857990f6d9e26241371e59b874568551905d78ed4555d73763ff850d6be6715edf46157d2db63270c86b5ae976b2f8cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lettre-doc-fr \
texlive-lettre-doc"

RDEPENDS:${PN} += ""

inherit rpm
