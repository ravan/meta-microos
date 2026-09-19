SUMMARY = "Documentation for texlive-hepunits"
DESCRIPTION = "This package includes the documentation for texlive-hepunits"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-doc-2026.226.2.0.0svn54758-60.4.noarch.rpm"
RPM_HASH = "40517d458e7fb02e98e630adbbce8b777ae2a4c8b6b5e471fa71a428cba05a47a64fe0755869190e17abe691d670ab53c5f79bd846b848c57806d2ff707c8b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
