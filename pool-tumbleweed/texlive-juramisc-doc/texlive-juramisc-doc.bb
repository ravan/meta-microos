SUMMARY = "Documentation for texlive-juramisc"
DESCRIPTION = "This package includes the documentation for texlive-juramisc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn15878"

RPM_NAME = "texlive-juramisc-doc-2026.226.0.0.91svn15878-63.2.noarch.rpm"
RPM_HASH = "88d21566b319417a864013b5235ce632295aa9df9f2899ed53af6eccbf41f755da819caad8f562f7d1289d6e6ba1778ef7e2d743e95a2ec83b03114c544d50d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-juramisc-doc-de \
texlive-juramisc-doc"

RDEPENDS:${PN} += ""

inherit rpm
