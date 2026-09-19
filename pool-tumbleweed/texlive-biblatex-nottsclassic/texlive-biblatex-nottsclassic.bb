SUMMARY = "Citation style for the University of Nottingham"
DESCRIPTION = "This citation-style covers the citation and bibliography rules \
of the University of Nottingham."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn41596"

RPM_NAME = "texlive-biblatex-nottsclassic-2026.226.0.0.1svn41596-61.2.noarch.rpm"
RPM_HASH = "4a5b2858a2cb7705781f5cb51b0e57137f7dec8a2ce8791e879bb2bdfb0135c1e72ccedb38a65162ae352066b526f0848ae90b68fa8b8f10bff39704f8ece045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nottsclassic-english.lbx \
tex-nottsclassic.bbx \
tex-nottsclassic.cbx \
texlive-biblatex-nottsclassic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-british.sty \
tex-csquotes.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
