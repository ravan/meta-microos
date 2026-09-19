SUMMARY = "Drawing molecular orbital diagrams"
DESCRIPTION = "The package provides an environment MOdiagram and some \
commands, to create molecular orbital diagrams using TikZ. For \
example, the MO diagram of dihydrogen would be written as: \
\\begin{MOdiagram} \\atom{left}{ 1s = {0;up} } \\atom{right}{ 1s = \
{0;up} } \\molecule{ 1sMO = {1;pair, } } \\end{MOdiagram} The \
package also needs the l3kernel and l3packages bundles from the \
LaTeX 3 experimental distribution."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn76924"

RPM_NAME = "texlive-modiagram-2026.226.0.0.3asvn76924-61.2.noarch.rpm"
RPM_HASH = "3cad46c836295e24193ddd477d19a34de4870809a12e52b0e7467ca3b81044fc609a4e33f2a8fd0e519656d2c5e8b8001d54d2b052127395ab5388b9af8f6723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modiagram.sty \
texlive-modiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemgreek.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
