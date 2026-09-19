SUMMARY = "Articles with teasers and continuation later on"
DESCRIPTION = "Jumplines is a package for typesetting (newspaper) articles \
that show a teaser (some few lines of text/content) and are \
continued at a later place, with optional hyperlinking and a \
list of articles. It requires lualatex for colour support in \
split boxes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn37553"

RPM_NAME = "texlive-jumplines-2026.226.0.0.2svn37553-63.2.noarch.rpm"
RPM_HASH = "83609fa5a3b526f5e2f2d1d5f9b62c52f5716aa1316281d4d9ee2c646cab2db7cb9b1b7a670c7bbe1e00344684dc56c89973ebbbd5f0f9d06369b84a2d9eb41e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jumplines.sty \
texlive-jumplines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-luacolor.sty \
tex-tcolorbox.sty \
tex-tocloft.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
