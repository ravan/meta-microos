SUMMARY = "A modern LaTeX beamer theme"
DESCRIPTION = "The package provides a simple, modern Beamer theme for anyone \
to use. It tries to minimize noise and maximize space for \
content."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn43031"

RPM_NAME = "texlive-beamertheme-metropolis-2026.226.1.2svn43031-61.2.noarch.rpm"
RPM_HASH = "4c7012e5e09efd376ee2ae383c089f3e4d1aeffe242764da9611f71c6d18086ef1f3364a39c447b4dc9896b982d9b0d044c4f1117cae64d528ab0f6d9b363cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthememetropolis-highcontrast.sty \
tex-beamercolorthememetropolis.sty \
tex-beamerfontthememetropolis.sty \
tex-beamerinnerthememetropolis.sty \
tex-beamerouterthememetropolis.sty \
tex-beamerthememetropolis.sty \
tex-pgfplotsthemetol.sty \
texlive-beamertheme-metropolis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-keyval.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
