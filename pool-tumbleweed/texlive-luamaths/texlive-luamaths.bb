SUMMARY = "Provide standard mathematical operations inside LaTeX documents using Lua"
DESCRIPTION = "The luamaths package is developed to perform standard \
mathematical operations inside LaTeX documents using Lua. It \
provides an easy way to perform standard mathematical \
operations. There is no particular environment in the package \
for performing mathematical operations. The package commands \
can be used in any environment (including the mathematics \
environment). There is no need to install Lua on users system \
as TeX distributions (TeX Live or MiKTeX) come bundled with \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn76924"

RPM_NAME = "texlive-luamaths-2026.226.1.6svn76924-59.2.noarch.rpm"
RPM_HASH = "7e6756b2880b24b9847c0ffc80daaa0b5af73438442091bc7fb4960ad7a04a8d3eec833949de652f18d1852b280dfd3d0575466cc9a17d7145e8755219edb833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamaths.sty \
texlive-luamaths"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luacode.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
