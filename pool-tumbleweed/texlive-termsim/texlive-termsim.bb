SUMMARY = "Simulate Win10, Ubuntu, and Mac terminals"
DESCRIPTION = "This LaTeX3 package provides environments terminal and \
terminal*, and macros \\termfile and \\termfile* to simulate \
Win10, Ubuntu and Mac terminals. It is based on tcolorbox, \
minted and listings."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1.1svn76924"

RPM_NAME = "texlive-termsim-2026.227.1.1.1svn76924-62.2.noarch.rpm"
RPM_HASH = "8263258562a5bc031b2c3b47a738a9d38ada97f97622ebabb40f136ce9537cfb285874112dcf528ba8ee5c8920f6de94973934ad1b6096cfc5236db8fc31abe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termsim.sty \
texlive-termsim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontawesome5.sty \
tex-l3keys2e.sty \
tex-tcolorbox.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
