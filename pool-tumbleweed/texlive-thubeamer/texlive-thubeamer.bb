SUMMARY = "A beamer theme for Tsinghua University"
DESCRIPTION = "This package provides a beamer theme designed for Tsinghua \
University."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1.0svn61071"

RPM_NAME = "texlive-thubeamer-2026.227.1.1.0svn61071-62.2.noarch.rpm"
RPM_HASH = "8dc25c0a9d3cda861654468d7d9906ad932327b8d17e4b503ffc09520634cba0dadb0382c8dbb72bedba662b902d0af1c328f0b2aa280f628a863c769100683c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemethubeamer.sty \
tex-beamerinnerthemethubeamer.sty \
tex-beamerouterthemethubeamer.sty \
tex-beamerthemethubeamer.sty \
texlive-thubeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algorithmic.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-calligra.sty \
tex-ctex.sty \
tex-enumerate.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-latexsym.sty \
tex-listings.sty \
tex-multicol.sty \
tex-multimedia.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-pgf.sty \
tex-pstricks.sty \
tex-stackengine.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
