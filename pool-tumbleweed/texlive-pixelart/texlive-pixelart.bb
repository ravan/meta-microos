SUMMARY = "Draw pixel-art pictures"
DESCRIPTION = "A LuaLaTeX package to draw pixel-art pictures using TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn66012"

RPM_NAME = "texlive-pixelart-2026.226.1.0.2svn66012-58.2.noarch.rpm"
RPM_HASH = "63cf29cd5dd2ae53ebbb506e14fed11bca380ec4793d3088e7226e2ddd50855b0d5451a705f07af839a6c2950591ad72acfa219b42b6f77058fc33728848b795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pixelart.sty \
tex-pixelart0.sty \
texlive-pixelart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-iftex.sty \
tex-luacode.sty \
tex-pgf.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
