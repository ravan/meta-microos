SUMMARY = "Draw Bode, Nyquist and Black plots with gnuplot and TikZ"
DESCRIPTION = "The package provides facilities to draw Bode, Nyquist and Black \
plots using Gnuplot and Tikz. Elementary Transfer Functions and \
basic correctors are preprogrammed for use."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn72949"

RPM_NAME = "texlive-bodegraph-2026.226.1.6svn72949-59.2.noarch.rpm"
RPM_HASH = "20a5b9d0ea92644b41bdfadf8115babeeafab84c82485c3387f87594778a74639b8c0ee07e4ebe240b36965bfa80f9d0d7ec1c4ecf6e9cb2c249dc5cec4aa604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bodegraph.sty \
texlive-bodegraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifsym.sty \
tex-ifthen.sty \
tex-relsize.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
