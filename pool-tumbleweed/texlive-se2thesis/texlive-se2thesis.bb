SUMMARY = "A Thesis Class for the Chair of Software Engineering II at the University of Passau, Germany"
DESCRIPTION = "The se2thesis bundle provides a document class for writing a \
theses with the Chair of Software Engineering II at the \
University of Passau, Germany. The class is based on Markus \
Kohm's KOMA-Script classes and provides several additions and \
customizations to these classes. While the class provides some \
basic settings, mostly regrading the type area, fonts, and the \
title page, it still provides large degrees of freedom to its \
users. However, the package's documentation also provides \
recommendations regarding several aspects, for example, \
recommending BibLaTeX for bibliographies."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.4.0svn76924"

RPM_NAME = "texlive-se2thesis-2026.226.4.4.0svn76924-60.2.noarch.rpm"
RPM_HASH = "de3a4e749d3b4b403d9e046d02c16409687ff484d5761001bdce45213ddbc9e82abbf0bbdda7a471cad809686259a48b4bee2b8f8d40787858d26dc710b43156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-se2colors.sty \
tex-se2fonts.sty \
tex-se2packages.sty \
tex-se2thesis.cls \
texlive-se2thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-booktabs.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-fvextra.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inconsolata-nerd-font.sty \
tex-inconsolata.sty \
tex-l3keys2e.sty \
tex-libertinus-otf.sty \
tex-libertinus-type1.sty \
tex-listings.sty \
tex-lua-widow-control.sty \
tex-microtype.sty \
tex-minted.sty \
tex-mismath.sty \
tex-ntheorem.sty \
tex-ragged2e.sty \
tex-scrlayer-scrpage.sty \
tex-selnolig.sty \
tex-sidenotesplus.sty \
tex-software-biblatex.sty \
tex-tcolorbox.sty \
tex-translations.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
