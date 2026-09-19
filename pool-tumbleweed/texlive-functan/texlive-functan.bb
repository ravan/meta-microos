SUMMARY = "Macros for functional analysis and PDE theory"
DESCRIPTION = "This package provides a convenient and coherent way to deal \
with name of functional spaces (mainly Sobolev spaces) in \
functional analysis and PDE theory. It also provides a set of \
macros for dealing with norms, scalar products and convergence \
with some object oriented flavor (it gives the possibility to \
override the standard behavior of norms, ...)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-functan-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "d32f3e7157d24384b3c36c9427a0b794cd8a2e09721f3efab344746569fc8d14d9923df74da0f8909c4d5d7a877dc95187bf001b065a386d5db234475c2691a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-functan.sty \
texlive-functan"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
