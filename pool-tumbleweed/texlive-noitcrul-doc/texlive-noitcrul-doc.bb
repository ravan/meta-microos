SUMMARY = "Documentation for texlive-noitcrul"
DESCRIPTION = "This package includes the documentation for texlive-noitcrul"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-noitcrul-doc-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "3b1cf9afa1630b8455f129e45a67bdf2e47699fd2f247bf8f31540a1758ec1ef8773ab1aff1962d09832efbed64c661a5c6ce5cc26ccc699ff647325f3957021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-noitcrul-doc-de \
texlive-noitcrul-doc"

RDEPENDS:${PN} += ""

inherit rpm
