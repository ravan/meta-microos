SUMMARY = "Drawing regular complex polytopes with PSTricks"
DESCRIPTION = "Pst-cox is a PSTricks package for drawing 2-dimensional \
projections of complex regular polytopes (after the work of \
Coxeter). The package consists of a macro library for drawing \
the projections. The complex polytopes appear in the study of \
the root systems and play a crucial role in many domains \
related to mathematics and physics. These polytopes have been \
completely described by Coxeter in his book 'Regular Complex \
Polytopes'. There exist only a finite numbers of exceptional \
regular complex polytopes (for example the icosahedron) and \
some infinite series (for example, one can construct a \
multi-dimensional analogue of the hypercube in any finite \
dimension). The library contains two packages. The first, \
pst-coxcoor, is devoted to the exceptional complex regular \
polytopes whose coordinates have been pre-computed. The second, \
pst-coxeterp, is devoted to the infinite series."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.0.0.98_betasvn15878"

RPM_NAME = "texlive-pst-cox-2026.226.0.0.98_betasvn15878-59.2.noarch.rpm"
RPM_HASH = "be4cd722316c8a37b64d76391d226b5d3bd4d089159936f9f970e3401b9edddf35b522ffdd0e34683a294c6fd5df677397c342832b90cd4c231cd7fca11e0b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-coxcoor.sty \
tex-pst-coxcoor.tex \
tex-pst-coxeterp.sty \
tex-pst-coxeterp.tex \
texlive-pst-cox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
