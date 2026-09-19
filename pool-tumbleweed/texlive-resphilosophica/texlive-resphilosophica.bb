SUMMARY = "Typeset articles for the journal Res Philosophica"
DESCRIPTION = "The bundle provides a class for typesetting articles for the \
journal Res Philosophica. This work was commissioned by the \
Saint Louis University."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.39svn76471"

RPM_NAME = "texlive-resphilosophica-2026.226.1.39svn76471-60.4.noarch.rpm"
RPM_HASH = "41e2978a4cb3310c25215c31c95154116ca6256183420ff29c12d71fe1a82d509e0ca74bf479e1515265418cd88633173c70982804df9d16afbc258a9b958676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resphilosophica.cls \
texlive-resphilosophica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsart.cls \
tex-collect.sty \
tex-fancyhdr.sty \
tex-footmisc.sty \
tex-hyperref.sty \
tex-mathdesign.sty \
tex-microtype.sty \
tex-natbib.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
