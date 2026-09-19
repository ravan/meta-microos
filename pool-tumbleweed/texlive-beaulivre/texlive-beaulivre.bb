SUMMARY = "Write your books in a colorful way"
DESCRIPTION = "This package provides a LaTeX class for typesetting books with \
a colorful design. Currently, it has native support for Chinese \
(both simplified and traditional), English, French, German, \
Italian, Japanese, Portuguese (European and Brazilian), Russian \
and Spanish typesetting. It compiles with either XeLaTeX or \
LuaLaTeX. This is part of the colorist class series and depends \
on colorist.sty from the colorist package. The package name \
'beaulivre' is taken from the French words 'beau' (= \
'beautiful') and 'livre' (= 'book')."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-beaulivre-2026.226.svn78004-61.2.noarch.rpm"
RPM_HASH = "aa6aa9091e038403260561d34ee0459dd531075c96a164f8014a591e6a006f7bc4a7b8758df8e039bf621b88c68055e5f48754924648bc226f0e31883a7fa14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beaulivre.cls \
texlive-beaulivre"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-caption.sty \
tex-colorist.sty \
tex-ctex.sty \
tex-draftwatermark.sty \
tex-embrac.sty \
tex-float.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-indentfirst.sty \
tex-lua-widow-control.sty \
tex-mathpazo.sty \
tex-nowidow.sty \
tex-projlib-font.sty \
tex-regexpatch.sty \
tex-silence.sty \
tex-tikz-cd.sty \
tex-unicode-math.sty \
tex-wrapfig2.sty \
texlive \
texlive-colorist \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
