SUMMARY = "Allow LuaTeX to load external Lua packages"
DESCRIPTION = "This package allows LuaTeX to load packages from the default \
package.path and package.cpath locations. This could be useful \
to load external Lua modules, including modules installed via \
LuaRocks. This package requires ifluatex."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn54779"

RPM_NAME = "texlive-luapackageloader-2026.226.0.0.2svn54779-59.2.noarch.rpm"
RPM_HASH = "f9184686ab24fea009a2fc99ac4e55d7fbc63b84e9bf1083a62129d9d849af139f00cca8e04116ec3e99f22823b74dfec54b8bd0c2bc26310f68c41df7413c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luapackageloader.sty \
texlive-luapackageloader"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
