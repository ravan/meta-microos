SUMMARY = "Draws bond graphs in LaTeX, using PGF/TikZ"
DESCRIPTION = "The package is used to draw bond graphs in LaTeX. It uses a \
recent version (3.0+) of PGF and TikZ for the drawing, hence, \
it is mainly a set of TikZ styles that makes the drawing of \
bond graphs easier. Compared to the bondgraph package this \
package relies more on TikZ styles and less on macros, to \
generate the drawings. As such it can be more flexible than \
his, but requires more TikZ knowledge of the user."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn36605"

RPM_NAME = "texlive-bondgraphs-2026.226.1.0.1svn36605-59.2.noarch.rpm"
RPM_HASH = "169a87503dbfd2a55425bbda6d99d2d81c3aa5c57482d4ff0cef9672bddf898c5e2d1682051fd3e7c006e68fc2211426dcae5124e6f799aed076c3fbf509e9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bondgraphs.sty \
texlive-bondgraphs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-bm.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
