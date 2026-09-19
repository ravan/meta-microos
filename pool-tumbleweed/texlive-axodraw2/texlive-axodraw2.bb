SUMMARY = "Feynman diagrams in a LaTeX document"
DESCRIPTION = "This package defines macros for drawing Feynman graphs in LaTeX \
documents. It is an important update of the axodraw package, \
but since it is not completely backwards compatible, we have \
given the style file a changed name. Many new features have \
been added, with new types of line, and much more flexibility \
in their properties. In addition, it is now possible to use \
axodraw2 with pdfLaTeX, as well as with the LaTeX-dvips method. \
However with pdfLaTeX (and also LuaLaTeX and XeLaTeX), an \
external program, axohelp, is used to perform the geometrical \
calculations needed for the pdf code inserted in the output \
file. The processing involves a run of pdfLaTeX, a run of \
axohelp, and then another run of pdfLaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1.1csvn77682"

RPM_NAME = "texlive-axodraw2-2026.226.2.1.1csvn77682-60.2.noarch.rpm"
RPM_HASH = "81190ff4e1c56372eb90dc2cfc33d6e7aa9b323aca80ed77570858b2b888ff39c1f3f20bedec75056f417513f95a23d21acad74ff0559cc2d7bc991d57570641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-axodraw2.sty \
texlive-axodraw2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-keyval.sty \
texlive \
texlive-axodraw2-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
