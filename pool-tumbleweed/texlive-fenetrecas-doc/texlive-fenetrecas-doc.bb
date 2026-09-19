SUMMARY = "Documentation for texlive-fenetrecas"
DESCRIPTION = "This package includes the documentation for texlive-fenetrecas"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn73069"

RPM_NAME = "texlive-fenetrecas-doc-2026.226.0.0.1.4svn73069-59.2.noarch.rpm"
RPM_HASH = "9fd030efdeb44326657b34787d6887e50949d8b9d013da3e8b416cd2617683806fc7acffc83416c8260f24ed1b253e8f6ae4a0cb2ff5f2bae839f7dd935ee46c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fenetrecas-doc"

RDEPENDS:${PN} += ""

inherit rpm
