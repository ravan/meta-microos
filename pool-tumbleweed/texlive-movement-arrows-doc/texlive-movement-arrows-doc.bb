SUMMARY = "Documentation for texlive-movement-arrows"
DESCRIPTION = "This package includes the documentation for texlive-movement-arrows"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn67270"

RPM_NAME = "texlive-movement-arrows-doc-2026.226.2.0svn67270-61.2.noarch.rpm"
RPM_HASH = "493e3409a51a65bccf0aa057c6ba6a5630213c3ef593f0b346ab36d3a99bd77d511f49fd8b60fb4657c651a7f8fd6923cd7fd116887d0c3182ff7da6fab6371c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-movement-arrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
