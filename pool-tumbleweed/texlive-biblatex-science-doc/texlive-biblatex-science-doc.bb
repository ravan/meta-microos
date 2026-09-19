SUMMARY = "Documentation for texlive-biblatex-science"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-science"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn48945"

RPM_NAME = "texlive-biblatex-science-doc-2026.226.1.2svn48945-61.2.noarch.rpm"
RPM_HASH = "bec366e5469f5d7a9d8d0237ff80af1df4f825ef321013cf4a5e645d22524869c922764854dff41fc9cc1dafd128763fc03fb204d41360f32643f219db451965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-science-doc"

RDEPENDS:${PN} += ""

inherit rpm
