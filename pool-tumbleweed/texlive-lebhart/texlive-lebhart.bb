SUMMARY = "Write your articles in a colorful way"
DESCRIPTION = "This package provides a LaTeX class for typesetting articles \
with a colorful design. Currently, it has native support for \
Chinese (simplified and traditional), English, French, German, \
Italian, Japanese, Portuguese (European and Brazilian), Russian \
and Spanish typesetting. It compiles with either XeLaTeX or \
LuaLaTeX. This is part of the colorist class series and depends \
on colorist.sty from the colorist package. The package name \
'lebhart' is taken from the German word 'lebhaft' ('vivid'), \
combined with the first three letters of 'Artikel' ('article')."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-lebhart-2026.226.svn78004-61.2.noarch.rpm"
RPM_HASH = "604bfe8517aa266d9c90bbac840a581425d3d4d31a054430cb1d8c9a911cd6204972d338bb1e868f11c07b263606c9a09990b0eeffeac783ff0db7324708a1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lebhart.cls \
texlive-lebhart"

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
