SUMMARY = "Documentation for texlive-biblatex-unified"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-unified"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn64975"

RPM_NAME = "texlive-biblatex-unified-doc-2026.226.1.20svn64975-61.2.noarch.rpm"
RPM_HASH = "01117235a62d960fcd70e033cb33eb960ea365f053a4bfb1e100579830a842f104b86f7de77e5d2f3ba598661720f98a5344b4aa79a8b8c2599d2474088e2209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-unified-doc"

RDEPENDS:${PN} += ""

inherit rpm
