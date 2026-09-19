SUMMARY = "Documentation for texlive-bxbase"
DESCRIPTION = "This package includes the documentation for texlive-bxbase"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn66115"

RPM_NAME = "texlive-bxbase-doc-2026.226.1.2asvn66115-59.2.noarch.rpm"
RPM_HASH = "3f1e507037d5a5e862ea34412756351a4027fa5fea953a8ce5a4a22a999963d72504eeefce665ff8e540b2bccfc650b22824bb427a53e42a22cbd934d0dcaadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxbase-doc-ja \
texlive-bxbase-doc"

RDEPENDS:${PN} += ""

inherit rpm
