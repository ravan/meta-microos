SUMMARY = "Documentation for texlive-algpseudocodex"
DESCRIPTION = "This package includes the documentation for texlive-algpseudocodex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn74973"

RPM_NAME = "texlive-algpseudocodex-doc-2026.226.1.2.0svn74973-61.2.noarch.rpm"
RPM_HASH = "c1b909be28abaea4b44d5de1dfbc376840f3ab848ce814b5d679f32f426c9437f9de9c73b45095a07d4163cca1c43d671908062ddb12ab356bf6026dc769e682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algpseudocodex-doc"

RDEPENDS:${PN} += ""

inherit rpm
