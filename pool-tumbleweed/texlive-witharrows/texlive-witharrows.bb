SUMMARY = "'Aligned' math environments with arrows for comments"
DESCRIPTION = "This package provides an environment WithArrows which is \
similar to the environment aligned of amsmath (and mathtools), \
but gives the possibility to draw arrows on the right side of \
the alignment. These arrows are usually used to give \
explanations concerning the mathematical calculus presented. \
The package requires the following other LaTeX packages: expl3, \
footnote, l3keys2e, tikz, and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9asvn77682"

RPM_NAME = "texlive-witharrows-2026.226.2.9asvn77682-60.2.noarch.rpm"
RPM_HASH = "4276b440ebfd33491e7761363f90b8a7bcb4e6798e75523effaf276f20f7194ab45e7255c4bc4cf41c1e9cd9a44b1d2887006f1ad389e5c98b8371b916a1ff04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-witharrows.sty \
tex-witharrows.tex \
texlive-witharrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-footnote.sty \
tex-footnotehyper.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
