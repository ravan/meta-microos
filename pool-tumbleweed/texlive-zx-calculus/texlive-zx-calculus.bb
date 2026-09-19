SUMMARY = "A library to typeset ZX Calculus diagrams"
DESCRIPTION = "This library (based on the great TikZ and TikZ-cd packages) \
allows you to typeset ZX-calculus directly in LaTeX. It comes \
with many pre-built wire shapes, a highly customizable node \
style (with multiple flavours for putting labels inside or \
outside nodes), and a 'debugging' mode to avoid getting lost in \
big diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn70647"

RPM_NAME = "texlive-zx-calculus-2026.226.2.3svn70647-59.4.noarch.rpm"
RPM_HASH = "0d5bafeb44b6262de55f2eea530aa00b2349c66bc86778dfd9c68291303eddb172f0114355f03834c71bff5fd52a7566d00c5b8cf5efbb904fee2ed109cfdc51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryzx-calculus.code.tex \
tex-zx-calculus.sty \
texlive-zx-calculus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz-cd.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
