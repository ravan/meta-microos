SUMMARY = "Documentation for texlive-svn-multi"
DESCRIPTION = "This package includes the documentation for texlive-svn-multi"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4dsvn64967"

RPM_NAME = "texlive-svn-multi-doc-2026.226.2.4dsvn64967-64.2.noarch.rpm"
RPM_HASH = "f993839db32aff62fa148eb5636779f2a44e4bd94a19ea116c7e85d29e930aa67a651a3b4ebe5fe973ea49b18e6e2ea05391294e0300708e3f082e1bc11b1571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svn-multi-doc"

RDEPENDS:${PN} += ""

inherit rpm
