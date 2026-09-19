SUMMARY = "Documentation for texlive-bundledoc"
DESCRIPTION = "This package includes the documentation for texlive-bundledoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5svn74306"

RPM_NAME = "texlive-bundledoc-doc-2026.226.3.5svn74306-59.2.noarch.rpm"
RPM_HASH = "995f7a9b0c654f85d9170163eedee8709660f1e272e21ccddf64a3ab4bc82df9aa5addf722788a0f1b10def516e6caf74dbc84c8642de993a0d35668161b5f2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-arlatex.1 \
man-bundledoc.1 \
texlive-bundledoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
