SUMMARY = "Documentation for texlive-everyshi"
DESCRIPTION = "This package includes the documentation for texlive-everyshi"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.00svn77682"

RPM_NAME = "texlive-everyshi-doc-2026.226.4.00svn77682-59.2.noarch.rpm"
RPM_HASH = "f2b851b133b161cdc3adee5c3913bd27140e07f533a256703f5acd67cc236ee911daec483e7dfa1ae6245b77a0316d31f721993f83c47de3528056e95be9c6a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everyshi-doc"

RDEPENDS:${PN} += ""

inherit rpm
