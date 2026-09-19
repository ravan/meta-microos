SUMMARY = "A set of units useful in high energy physics applications"
DESCRIPTION = "Hepunits is a LaTeX package built on the SIunits package which \
adds a collection of useful HEP units to the existing SIunits \
set. These include the energy units \\MeV, \\GeV, \\TeV and the \
derived momentum and mass units \\MeVoverc, \\MeVovercsq and so \
on."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-2026.226.2.0.0svn54758-60.4.noarch.rpm"
RPM_HASH = "e350f3eea71cf43b61fcff96b119c19b1c779d3abb7fce5a31d170a39e235eb028da555fd3f483e1bb4ad160dcc8ffbcdc2b8ecd33c684f202441c599dce55ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hepunits.sty \
texlive-hepunits"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ifthen.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
