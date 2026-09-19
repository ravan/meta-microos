SUMMARY = "Write your articles or books in a simple and clear way"
DESCRIPTION = "This package offers you a LaTeX style file and two classes to \
typeset articles or books in a simple and clear way. These \
classes currently have native support for English, French, \
German, Italian, Portuguese (European and Brazilian), and \
Spanish typesetting. They compile with any major TeX engine. \
You may also wish to consider the packages einfart and \
simplivre, which are enhanced versions of the classes provided \
here. They have unicode support, thus can only be used with \
either XeLaTeX or LuaLaTeX. Currently they have native support \
for Chinese (both simplified and traditional), English, French, \
German, Italian, Japanese, Portuguese (European and Brazilian), \
Russian and Spanish typesetting, and also use more beautiful \
fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-minimalist-2026.226.svn78004-61.2.noarch.rpm"
RPM_HASH = "d4c920e2f688698391d1d74f8ad867a4e1864a0b0ea5043f636d685156fb820d7e83cd54be103b8891bd8d1db2a64daad285f587c1708b0e833652c943e4fd69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minimalist-classical.sty \
tex-minimalist-classicthesis.sty \
tex-minimalist-default.sty \
tex-minimalist-flow.sty \
tex-minimalist-plain.sty \
tex-minimalist-stream.sty \
tex-minimalist.sty \
tex-minimart.cls \
tex-minimbook.cls \
texlive-minimalist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-bookmark.sty \
tex-caption.sty \
tex-classicthesis.sty \
tex-draftwatermark.sty \
tex-embrac.sty \
tex-enumitem.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-imakeidx.sty \
tex-indentfirst.sty \
tex-lineno.sty \
tex-lua-widow-control.sty \
tex-mathpazo.sty \
tex-mathtools.sty \
tex-newpxtext.sty \
tex-nowidow.sty \
tex-parskip.sty \
tex-projlib-author.sty \
tex-projlib-draft.sty \
tex-projlib-font.sty \
tex-projlib-language.sty \
tex-projlib-paper.sty \
tex-projlib-theorem.sty \
tex-projlib-titlepage.sty \
tex-regexpatch.sty \
tex-relsize.sty \
tex-silence.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-tikzpagenodes.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-wrapfig2.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-projlib \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
