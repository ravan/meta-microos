SUMMARY = "Emoji support in (Lua)LaTeX"
DESCRIPTION = "This package allows users to typeset emojis in LaTeX documents. \
It requires the LuaHBTeX engine, which can be called by \
lualatex since TeX Live 2020, or lualatex-dev in TeX Live 2019."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.2svn77682"

RPM_NAME = "texlive-emoji-2026.226.0.0.2.2svn77682-61.4.noarch.rpm"
RPM_HASH = "d011db286a151bdf3251ec7684074128207f51c76fc128626250b8f75845e3f4862e4b974e347d55281faf25918a57f61b8d856be8e50b3b44198835985b76e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emoji-table.def \
tex-emoji.sty \
texlive-emoji"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
