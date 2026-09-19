SUMMARY = "Generate calling cards for dances"
DESCRIPTION = "A package and a class used to typeset traditional country \
dances, such as contra and square dances, and to create calling \
cards for the same."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn67201"

RPM_NAME = "texlive-contracard-2026.226.2.0.0svn67201-61.2.noarch.rpm"
RPM_HASH = "4811f0ca84aa4878304123a86f62267f493f5bab04f5106fcf647075eeae08068014afd27d7737a07c9c27f5ea11e7ea7c845e4f46feda3506719559e3780376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-contracard.cls \
tex-contracard.sty \
texlive-contracard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-imakeidx.sty \
tex-intcalc.sty \
tex-textcomp.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
