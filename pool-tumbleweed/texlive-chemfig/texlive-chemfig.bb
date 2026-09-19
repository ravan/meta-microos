SUMMARY = "Draw molecules with easy syntax"
DESCRIPTION = "The package provides the command \\chemfig{<code>}, which draws \
molecules using the TikZ package. The <code> argument provides \
instructions for the drawing operation. While the diagrams \
produced are essentially 2-dimensional, the package supports \
many of the conventional notations for illustrating the \
3-dimensional layout of a molecule. The package uses TikZ for \
its actual drawing operations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.71svn77682"

RPM_NAME = "texlive-chemfig-2026.226.1.71svn77682-60.2.noarch.rpm"
RPM_HASH = "5b0131cea7beac76e7daa6cf97a4758c595a574eca88aa9e9719a982f0b4705b3df2fe92c67a2a3ddaa6c33c1e30a8a893a9713b284753fbdcf03925e6b2bc2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemfig-lewis.tex \
tex-chemfig.sty \
tex-chemfig.tex \
texlive-chemfig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
