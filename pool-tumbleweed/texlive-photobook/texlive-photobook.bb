SUMMARY = "A document class for typesetting photo books"
DESCRIPTION = "The photobook LaTeX document class extends the book class \
defining a set of parameters, meta-macros, macros and \
environments with reasonable defaults to help typeset, build \
and print books mainly based on visual/image content."
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.1.31svn71843"

RPM_NAME = "texlive-photobook-2026.226.0.0.1.31svn71843-58.2.noarch.rpm"
RPM_HASH = "b92f9db45456d4fd9f0c5f6d4dbf9c7e5cb2a30a30d72280c0a8cee35d64ae222f1ea53adbc50b4220a4a283463e98b58e1041e44d9a96f50b05a76719ed6a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-photobook.cls \
texlive-photobook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-atbegshi.sty \
tex-book.cls \
tex-calc.sty \
tex-colorspace.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fancyvrb.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-listofitems.sty \
tex-numprint.sty \
tex-pagecolor.sty \
tex-pdfpages.sty \
tex-pgffor.sty \
tex-rotating.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-trimclip.sty \
tex-xargs.sty \
tex-xcolor.sty \
tex-xint.sty \
tex-xinttools.sty \
tex-xkeyval.sty \
texlive \
texlive-adjustbox \
texlive-atbegshi \
texlive-changepage \
texlive-colorspace \
texlive-environ \
texlive-eso-pic \
texlive-etoolbox \
texlive-fancyhdr \
texlive-fancyvrb \
texlive-filesystem \
texlive-flowfram \
texlive-geometry \
texlive-graphics \
texlive-hyperref \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kvoptions \
texlive-listofitems \
texlive-mdframed \
texlive-numprint \
texlive-pagecolor \
texlive-pdfcomment \
texlive-pdfpages \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-textpos \
texlive-xargs \
texlive-xcolor \
texlive-xint \
texlive-xkeyval"

inherit rpm
