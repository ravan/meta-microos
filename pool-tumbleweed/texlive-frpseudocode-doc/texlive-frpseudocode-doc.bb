SUMMARY = "Documentation for texlive-frpseudocode"
DESCRIPTION = "This package includes the documentation for texlive-frpseudocode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn56088"

RPM_NAME = "texlive-frpseudocode-doc-2026.226.0.0.3.0svn56088-60.2.noarch.rpm"
RPM_HASH = "c6c6ca2521e1933106954f009d19f4952a10c5d8cd6b7daa648637e2d33990544fd96d301bab981dcac5805bda6b71e8dbfa35b679438da864e57c2a71225c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frpseudocode-doc"

RDEPENDS:${PN} += ""

inherit rpm
