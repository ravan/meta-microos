SUMMARY = "Draw keys and screen items of several Casio calculators"
DESCRIPTION = "This package defines commands to draw the Casio Graph 35 / \
fx-9750GII calculator (and other models). It can draw the whole \
calculator, or parts of it (individual keys, part of the \
screen, etc.). It was written to typeset documents instructing \
students how to use their calculator."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn66772"

RPM_NAME = "texlive-graph35-2026.226.0.0.1.4svn66772-60.4.noarch.rpm"
RPM_HASH = "39cf974ad2a901ff77addba15c2c792368f037111bd877bc46d4c7ae3464574ea399490dfd19546d4e9738d2c07fb99375a18b090360d62ee4dff51c9a109fc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graph35-keys.sty \
tex-graph35-pixelart.sty \
tex-graph35.sty \
texlive-graph35"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-etoolbox.sty \
tex-letterspace.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-pixelart0.sty \
tex-sansmath.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
