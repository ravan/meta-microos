SUMMARY = "Write your books in a simple and clear way"
DESCRIPTION = "This package provides a LaTeX class for typesetting books with \
a simple and clear design. Currently, it has native support for \
Chinese (simplified and traditional), English, French, German, \
Italian, Japanese, Portuguese (European and Brazilian), Russian \
and Spanish typesetting. It compiles with either XeLaTeX or \
LuaLaTeX. This is part of the minimalist class series and \
depends on minimalist.sty from the minimalist package. The \
package name 'simplivre' is taken from the French words \
'simple' and 'livre' (= 'book')."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-simplivre-2026.226.svn78004-64.2.noarch.rpm"
RPM_HASH = "d05d6e18b2453b803d43e67b8d35662f2befe0bc0394f1587c435012b4538aa1fc0c8cfa9e63ad9864aab55051b6609bc90a53a788d791e914bec67944615c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplivre.cls \
texlive-simplivre"

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
