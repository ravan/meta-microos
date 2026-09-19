SUMMARY = "A beamer theme for LALIC"
DESCRIPTION = "This package provides the beamer theme for LALIC (Laboratorio \
de Linguistica e Inteligencia Computacional of the Federal \
University of Sao Carlos, Brazil)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn58777"

RPM_NAME = "texlive-beamerthemelalic-2026.226.1.0svn58777-61.2.noarch.rpm"
RPM_HASH = "742bd92a87fe982ad38e88067c797380a4105b2106e808ba6407f121bb136686e2d48a1032cf4e909ac18393af2d0a06f3a255d692c7e200c764a3babdb07f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemelalic.sty \
tex-beamerfontthemelalic.sty \
tex-beamerinnerthemelalic.sty \
tex-beamerouterthemelalic.sty \
tex-beamerthemelalic.sty \
texlive-beamerthemelalic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calculator.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
