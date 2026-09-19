SUMMARY = "Set Operations inside LaTeX documents using Lua"
DESCRIPTION = "The luaset package is developed to define finite sets and \
perform operations on them inside LaTeX documents. There is no \
particular environment in the package for performing set \
operations. The package commands can be used in any environment \
(including the mathematics environment). It is written in Lua, \
and the .tex file is to be compiled with the LuaLaTeX engine. \
The time required for operations on sets is not an issue while \
compiling with the LuaLaTeX engine. There is no need to install \
Lua on the users system as TeX distributions (TeX Live or \
MiKTeX) come bundled with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-luaset-2026.226.1.1svn76924-59.2.noarch.rpm"
RPM_HASH = "8c2857d62205b982c7f1e32e2f3c8a439c8ddec8c659f031d37051a24330b56809ac8600736f6829a8783a044d7b522c1899a35c5853bf9fed73f0caef0a3786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaset.sty \
texlive-luaset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-luacode.sty \
tex-luamaths.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
