SUMMARY = "Typeset recipes in note-card-sized boxes"
DESCRIPTION = "The recipecard class typesets recipes into note card sized \
boxes that can then be cut out and pasted on to note cards. The \
recipe then looks elegant and fits in the box of recipes."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-recipecard-2026.226.2.0svn15878-60.4.noarch.rpm"
RPM_HASH = "023c1d0a70b51ae77ab07eb6d61b33bf2fb85e3626677551df8ac9d27b93385fbb4d709a5f89a9c46d391d1712c433cdcfca07604e76004e1b9bccd36ed76c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recipecard.cls \
texlive-recipecard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-boxedminipage.sty \
tex-calc.sty \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
