SUMMARY = "Converting and rendering markdown documents inside TeX"
DESCRIPTION = "The package provides facilities for the conversion of markdown \
and YAML markup to plain TeX. These are provided both in form \
of a Lua module and in form of plain TeX, LaTeX, and ConTeXt \
macro packages that enable the direct inclusion of markdown and \
YAML documents inside TeX documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.13.0_0_gdd212d58svn77254"

RPM_NAME = "texlive-markdown-2026.226.3.13.0_0_gdd212d58svn77254-59.2.noarch.rpm"
RPM_HASH = "15c95bb79270d940e0f2f0affee0f0a8cb6295217ac8349d2bd354a654142c039bfcb34f2d9a28b0f7af956e13b1f3e07566a86808ff8fec0c73f773f787d565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-markdown.sty \
tex-markdown.tex \
tex-markdownthemewitiko-markdown-defaults.sty \
tex-markdownthemewitiko-markdown-defaults.tex \
tex-t-markdown.tex \
tex-t-markdownthemewitiko-markdown-defaults.tex \
texlive-markdown"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-csvsimple.sty \
tex-expl3.sty \
tex-fancyvrb.sty \
tex-graphicx.sty \
tex-ltxcmds.sty \
tex-url.sty \
tex-verse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-lt3luabridge \
texlive-lua-tinyyaml \
texlive-markdown-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
