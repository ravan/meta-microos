SUMMARY = "Mimic the screen of older Texas Instruments calculators"
DESCRIPTION = "This package mimics the screen of older Texas Instruments dot \
matrix display calculators, specifically the TI-82 STATS. It \
relies on the lcd and xcolor packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn62602"

RPM_NAME = "texlive-tiscreen-2026.226.svn62602-59.2.noarch.rpm"
RPM_HASH = "189750037c9ed8c321540ac807c443a62e1d2fc7f4f2f91a69251f5fb1a64f5ea71019a435a8bdb29e51c15d2ca15a841e661d09642ee5a3cf1ad35097791bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tiscreen.sty \
texlive-tiscreen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-lcd.sty \
tex-tcolorbox.sty \
tex-textgreek.sty \
tex-tikz.sty \
tex-tipa.sty \
tex-wasysym.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
