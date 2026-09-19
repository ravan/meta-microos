SUMMARY = "Graphs and Automata Simplified in TeX"
DESCRIPTION = "GasTeX is a set of LaTeX macros which enable the user to draw \
graphs, automata, nets, diagrams, etc., very easily, in the \
LaTeX picture environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn69842"

RPM_NAME = "texlive-gastex-2026.226.3.1svn69842-60.2.noarch.rpm"
RPM_HASH = "dc060a296593e14cdf41423ee41e2d045a22e7e25d75a43ceeeeb26cf70ff938f0519e4d5da69636f2a4917d15871c0f60f2faa4bf3df82e1a390dbcc61f57a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gastex.sty \
texlive-gastex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auto-pst-pdf.sty \
tex-calc.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-pst-pdf.sty \
tex-trig.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
