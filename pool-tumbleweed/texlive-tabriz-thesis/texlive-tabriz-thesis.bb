SUMMARY = "A template for the University of Tabriz"
DESCRIPTION = "The package offers a document class for typesetting theses and \
dissertations at the University of Tabriz. The class requires \
use of XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn51729"

RPM_NAME = "texlive-tabriz-thesis-2026.227.1.1svn51729-62.2.noarch.rpm"
RPM_HASH = "51b28bbe38232c45e3e5e544bae205cccff00a6cdaa0e2c7d6fabf4dc56fe4f6bbf1820d99a8fd6bab4235092b799201724a012d48d831e8587db5dfe22e659d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabriz-thesis.cls \
texlive-tabriz-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-book.cls \
tex-fancyhdr.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lastpage.sty \
tex-makeidx.sty \
tex-tocbibind.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
