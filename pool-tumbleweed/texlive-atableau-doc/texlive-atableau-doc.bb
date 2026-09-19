SUMMARY = "Documentation for texlive-atableau"
DESCRIPTION = "This package includes the documentation for texlive-atableau"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.0svn76924"

RPM_NAME = "texlive-atableau-doc-2026.226.2.2.0svn76924-60.2.noarch.rpm"
RPM_HASH = "dba696cdeccaf07aa3111990e8ae90cc6e6210dd72991b77e7f79952d8e941f30227d6c707356437e5a4bc4fbf4529af2438f700735cd8fdc5eab8ee868971ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atableau-doc"

RDEPENDS:${PN} += ""

inherit rpm
