SUMMARY = "A LaTeX package for symmetric group combinatorics"
DESCRIPTION = "A LaTeX package for symmetric group combinatorics, with \
commands for Young diagrams, tableaux, tabloids, skew tableaux, \
shifted tableaux, ribbon tableaux, multitableaux, abacuses. \
These commands are intended to be easy to use and easy to \
customise. In particular, TikZ styling can be added to the \
components of these diagrams and common conventions and idioms \
are supported using a key-value interface. All diagrams can be \
used as standalone commands or as part of tikzpicture \
environments."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.0svn76924"

RPM_NAME = "texlive-atableau-2026.226.2.2.0svn76924-60.2.noarch.rpm"
RPM_HASH = "fcbc2408c6b3804a2c4d469acb5ab74dcfc54f2841f14113fbe9ab08db492db9f5d90b8e03fb275c4a0cb3d3afb3f2bb80d78ac8c8d42aeffb17dd2f3f0e2db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atableau.sty \
texlive-atableau"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
