SUMMARY = "Documentation for texlive-heros-otf"
DESCRIPTION = "This package includes the documentation for texlive-heros-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-heros-otf-doc-2026.226.0.0.01svn77682-60.4.noarch.rpm"
RPM_HASH = "599a65f4213cad0fd9c48dbc0f6c02b17ad8e7bea1afa5080056ca44b0b29aacff5e37f45727036e1192d88a0551f5a141f13e233cdccc57d77f839ca4f86821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heros-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
