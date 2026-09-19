SUMMARY = "A beamer theme for Harbin Institute of Technology, ShenZhen"
DESCRIPTION = "This is a beamer theme designed for Harbin Institute of \
Technology, ShenZhen (HITSZ)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-2026.226.1.0.0svn54381-60.4.noarch.rpm"
RPM_HASH = "13f9fe6406a21d114cdf2eaad7d0bb3e617814c56401ea3eef8fc3e86dd0c8326acf95dcf2da25c0bed7a6ca84925962b3858330b4868ea284d56d831904d5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemehitszbeamer.sty \
tex-beamerinnerthemehitszbeamer.sty \
tex-beamerouterthemehitszbeamer.sty \
tex-beamerthemehitszbeamer.sty \
texlive-hitszbeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ctex.sty \
tex-multicol.sty \
tex-multimedia.sty \
tex-natbib.sty \
tex-pgf.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
