SUMMARY = "A LaTeX package with tools for graph plotting (and TikZ)"
DESCRIPTION = "This package provides some commands to help French mathematics \
teachers for 15-18 years olds, with graphs of functions: define \
and draw functions and interpolations curves work with \
integrals, tangents, intersections get coordinates of points \
... The syntax is rather explicit, like \\DefinirCourbe, \
\\RecupererCoordonnees,\\TrouverIntersections, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.30bsvn78169"

RPM_NAME = "texlive-tkz-grapheur-2026.226.0.0.30bsvn78169-59.2.noarch.rpm"
RPM_HASH = "d2073f1ad5807be0cd2ff9dbf6ac9e71e884639eae8d45f3a1010427d0c3ff6a9da68b364385c41cfaa79f79e15b3c0ccedb5782dac42011dc9a8c194b84bf5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-grapheur.sty \
texlive-tkz-grapheur"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-listofitems.sty \
tex-pgfplots.sty \
tex-simplekv.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xint-regression.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
