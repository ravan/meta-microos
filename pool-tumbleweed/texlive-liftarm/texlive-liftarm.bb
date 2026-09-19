SUMMARY = "Geometric constructions with liftarms using TikZ and LaTeX3"
DESCRIPTION = "This package is based on the package TikZ and can be used to \
draw geometric constructions with liftarms. There are several \
options for the appearance of the liftarms. It provides an \
environment to connect multiple liftarms using the \
Newton-Raphson method and LU decomposition. It also provides a \
command to describe a construction and a method to animate a \
construction with one or more traces."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn76924"

RPM_NAME = "texlive-liftarm-2026.226.4.0svn76924-61.2.noarch.rpm"
RPM_HASH = "3c1c41ace3fb099200512321a11268617e4cf1414330eea965b7e701b12c5cebba463f73f1b676aea49aedce69eef5b2c92bd3b53e8ef589e7960066d21c2f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-liftarm.sty \
texlive-liftarm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
