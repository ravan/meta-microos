SUMMARY = "Documentation for texlive-biblatex-bwl"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bwl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn26556"

RPM_NAME = "texlive-biblatex-bwl-doc-2026.226.0.0.02svn26556-61.2.noarch.rpm"
RPM_HASH = "15904a3b3fd06f8ceee81314654d10b5fa02494b8394fa24536e4fb5bf7e5f050a5133e753bb5514debdf92665f2209f15e395278c3c70f83f21063378e6050a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bwl-doc"

RDEPENDS:${PN} += ""

inherit rpm
