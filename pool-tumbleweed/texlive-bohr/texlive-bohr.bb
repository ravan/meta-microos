SUMMARY = "Simple atom representation according to the Bohr model"
DESCRIPTION = "The package provides means for the creation of simple Bohr \
models of atoms up to the atomic number 112. In addition, \
commands are provided to convert atomic numbers to element \
symbols or element names and vice versa."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn62977"

RPM_NAME = "texlive-bohr-2026.226.1.0svn62977-59.2.noarch.rpm"
RPM_HASH = "4e821ec6794e0de9da2e3c2cd8691fea9ff922fe3135b7cdaa6df8c69e4b65d4137d6dd851fb690121394bfe7143b973cbe16099bc286945ddb36abb5dabea9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bohr.sty \
texlive-bohr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-elements.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
