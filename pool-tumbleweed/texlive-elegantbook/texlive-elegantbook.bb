SUMMARY = "An Elegant LaTeX Template for Books"
DESCRIPTION = "ElegantBook is designed for writing Books. This template is \
based on the standard LaTeX book class. The goal of this \
template is to make the writing process more elegant."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6svn78191"

RPM_NAME = "texlive-elegantbook-2026.226.4.6svn78191-61.4.noarch.rpm"
RPM_HASH = "2619f956defe83b982b3427bcc851e52ed7d0eecc271a38f88dc121ff70d811ad368313b48ba2e1014a644cc1e87d682571d1b4bc0664edcd22c8d8e3565e508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elegantbook.cls \
texlive-elegantbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adforn.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-appendix.sty \
tex-apptools.sty \
tex-babel.sty \
tex-bbding.sty \
tex-bm.sty \
tex-book.cls \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-ctex.sty \
tex-enumerate.sty \
tex-enumitem.sty \
tex-esint.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fancyvrb.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-lipsum.sty \
tex-listings.sty \
tex-luatexja.sty \
tex-makecell.sty \
tex-manfnt.sty \
tex-mathrsfs.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-mwe.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-pifont.sty \
tex-setspace.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
