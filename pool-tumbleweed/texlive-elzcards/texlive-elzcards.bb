SUMMARY = "Typeset business cards, index cards and flash cards easily"
DESCRIPTION = "A LaTeX package for typesetting business cards, index cards, \
and flash cards in an easy and flexible way, optionally also \
the reverse side. You will have to furnish the paper size, the \
desired size of your card, the printable area of your printer, \
and the design of the card. Everything else is taken care of by \
elzcards."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.60svn51894"

RPM_NAME = "texlive-elzcards-2026.226.1.60svn51894-61.4.noarch.rpm"
RPM_HASH = "7eb07363961c7d68e98875e44f2f78d9035bf4f4a5e4c2dab2b830aa4adf20d609a2ce0e77b8a47c97f2e79a81f2d16180aad1878aa4911ee88fed2d4961321a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elzcards.sty \
texlive-elzcards"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
