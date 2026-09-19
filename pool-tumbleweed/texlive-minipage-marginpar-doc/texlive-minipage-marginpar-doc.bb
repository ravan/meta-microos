SUMMARY = "Documentation for texlive-minipage-marginpar"
DESCRIPTION = "This package includes the documentation for texlive-minipage-marginpar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-minipage-marginpar-doc-2026.226.0.0.2svn15878-61.2.noarch.rpm"
RPM_HASH = "2957e8de8c83f88874af114b2995ec9ca86b8499191dfd77bab2cc55d93ea9a9782fc5fcb8fb4713574a4dbd847d4c38e9aac5b0aca5b26e0ea8ead327906961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-minipage-marginpar-doc-de \
texlive-minipage-marginpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
