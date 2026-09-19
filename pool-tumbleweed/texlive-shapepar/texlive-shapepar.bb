SUMMARY = "A macro to typeset paragraphs in specific shapes"
DESCRIPTION = "\\shapepar is a macro to typeset paragraphs in a specific shape. \
The size is adjusted automatically so that the entire shape is \
filled with text. There may not be displayed maths or \
'\\vadjust' material (no \\vspace) in the argument of \\shapepar. \
The macros work for both LaTeX and plain TeX. For LaTeX, \
specify \\usepackage{shapepar}; for Plain, \\input shapepar.sty. \
\\shapepar works in terms of user-defined shapes, though the \
package does provide some predefined shapes: so you can form \
any paragraph into the form of a heart by putting \
\\heartpar{sometext...} inside your document. The tedium of \
creating these polygon definitions may be alleviated by using \
the shapepatch extension to transfig which will convert xfig \
output to \\shapepar polygon form."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-shapepar-2026.226.2.2svn77682-60.2.noarch.rpm"
RPM_HASH = "04c7c4c429100c341a1917bd8dd100c388d36b93f1059a8c48e422f5876dacf378193ee93c22f81ab5004b96389b75c6e20b4f07fec66aa86df2b5377a646387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Canflagshape.def \
tex-TeXshape.def \
tex-candleshape.def \
tex-dropshape.def \
tex-shapepar.sty \
tex-triangleshapes.def \
texlive-shapepar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
