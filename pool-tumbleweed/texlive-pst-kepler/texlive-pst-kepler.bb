SUMMARY = "Models for Johannes Kepler's view of the world"
DESCRIPTION = "This package is dedicated to Jurgen Gilg (8.2.1966-6.5.2022). \
It defines macros which show Johannes Kepler's view of the \
world."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77232"

RPM_NAME = "texlive-pst-kepler-2026.226.0.0.01svn77232-59.2.noarch.rpm"
RPM_HASH = "32474953ea4804f922be7ddc4e6bde0e91cc90b5f03b523d34d6bb9bb528e95be8d4ef636e56b9c17d72dfcffaf97937389e66bf8f63728f19be4c5f72346b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-kepler.sty \
tex-pst-kepler.tex \
texlive-pst-kepler"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-animate.sty \
tex-hvextern.sty \
tex-pst-eucl.sty \
tex-pstricks.sty \
tex-xint.sty \
tex-xintexpr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
