SUMMARY = "Documentation for texlive-rbt-mathnotes"
DESCRIPTION = "This package includes the documentation for texlive-rbt-mathnotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn76924"

RPM_NAME = "texlive-rbt-mathnotes-doc-2026.226.1.0.2svn76924-60.4.noarch.rpm"
RPM_HASH = "9ad5ccfb6fe7d06784b6de79ce904c401557887f152b36f6ac1edac26d4bc1c337ffa5bc11f4dcfe843a9c5954d3c3b42575114228ee415117c17c4423af7f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rbt-mathnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
