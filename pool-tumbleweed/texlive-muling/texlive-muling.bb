SUMMARY = "MA Thesis class for the Department of Linguistics, University of Mumbai"
DESCRIPTION = "This is a class file for writing MA thesis as required by the \
Department of Linguistics at the University of Mumbai."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.5svn66741"

RPM_NAME = "texlive-muling-2026.226.0.0.5svn66741-61.2.noarch.rpm"
RPM_HASH = "f242045a38bb86a09e87cb34b66fba0195833474268516fd9edf03a93778f789f0410753119bda7c51d7d2de093cfaf557f118aca8c69239ab59f698dca9c1c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-muling.cls \
texlive-muling"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-book.cls \
tex-csquotes.sty \
tex-expex.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-forest.sty \
tex-hyperref.sty \
tex-leipzig.sty \
tex-tipa.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
