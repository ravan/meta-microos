SUMMARY = "Commands to include lilypond scores within a (Lua)LaTeX document"
DESCRIPTION = "This package provides macros for the inclusion of LilyPond \
scores within LuaLaTeX. It calls LilyPond to compile scores, \
then includes the produced files. Dependencies: currfile, \
environ, graphicx, luaotfload, luaoptions, luatexbase, \
metalogo, minibox, pdfpages, xkeyval."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.5svn66880"

RPM_NAME = "texlive-lyluatex-2026.226.1.1.5svn66880-59.2.noarch.rpm"
RPM_HASH = "17ac8505fff35b26c5dc9849fc6824b47a08106249eb54e140036a1cdfd64f72d9d820efc960f2b70d49ad6da34f98f331f7385b4eda73a5b0c61833755f16bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lyluatex.sty \
texlive-lyluatex"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-luaoptions.sty \
tex-metalogo.sty \
tex-minibox.sty \
tex-pdfpages.sty \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
