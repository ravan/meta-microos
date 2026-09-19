SUMMARY = "Write your articles in a simple and clear way"
DESCRIPTION = "This package provides a LaTeX class for typesetting articles \
with a simple and clear design. Currently, it has native \
support for Chinese (simplified and traditional), English, \
French, German, Italian, Japanese, Portuguese (European and \
Brazilian), Russian and Spanish typesetting. It compiles with \
either XeLaTeX or LuaLaTeX. This is part of the minimalist \
class series and depends on minimalist.sty from the minimalist \
package. The package name 'einfart' is taken from the German \
word 'einfach' ('simple'), combined with the first three \
letters of 'Artikel' ('article')."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-einfart-2026.226.svn78004-61.4.noarch.rpm"
RPM_HASH = "08f393dd8cfafc6344f03a35bf333666c0b179472bd6c9eda3eafbd01eb427c4a8c8f11b95ceb45e9af47aa4bae1112f5bed62dbe27f40f97736e77e5a8c1727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-einfart.cls \
texlive-einfart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-caption.sty \
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
tex-minimalist.sty \
tex-nowidow.sty \
tex-parskip.sty \
tex-projlib-font.sty \
tex-regexpatch.sty \
tex-silence.sty \
tex-tikz-cd.sty \
tex-unicode-math.sty \
tex-wrapfig2.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-minimalist \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
