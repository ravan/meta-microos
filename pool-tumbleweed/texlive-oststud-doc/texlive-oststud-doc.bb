SUMMARY = "Documentation for texlive-oststud"
DESCRIPTION = "This package includes the documentation for texlive-oststud"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn67217"

RPM_NAME = "texlive-oststud-doc-2026.226.0.0.4svn67217-61.2.noarch.rpm"
RPM_HASH = "27aea2ce23a4312f76539774b8410800ad03ff23158fb68d42e6dc8138e2badae01a3787d9b10232d2dab5f603a3522de0ab4bc3752274715ca10931d586bc04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oststud-doc"

RDEPENDS:${PN} += ""

inherit rpm
