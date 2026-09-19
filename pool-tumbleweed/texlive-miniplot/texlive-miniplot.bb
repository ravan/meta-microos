SUMMARY = "A package for easy figure arrangement"
DESCRIPTION = "MiniPlot is a package to help the LaTeX user typeset EPS \
figures using an easy-to-use interface. Figures can be arranged \
as one-figure-only or as a collection of figures in columns and \
rows which can itself contain sub-figures in columns and rows. \
Wrapped figures are also supported. This package provides \
commands to display a framebox instead of the figure as the \
graphics package does already but additionally it writes useful \
information such as the label and scaling factor into these \
boxes."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17483"

RPM_NAME = "texlive-miniplot-2026.226.svn17483-61.2.noarch.rpm"
RPM_HASH = "f5c687a66f0a0e83aca21e81370c4febf9c2d5db8faf843fc1359cec0e89929d4c33dd5b1a945b5ccd601a1383efe598af5e784e6556d57c28e646c449cab0e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-miniplot.sty \
texlive-miniplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-epsfig.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
