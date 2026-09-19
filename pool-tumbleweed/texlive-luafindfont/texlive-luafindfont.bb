SUMMARY = "Search fonts in the LuaTeX font database"
DESCRIPTION = "This Lua script searches for fonts in the font database."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.16svn75679"

RPM_NAME = "texlive-luafindfont-2026.226.0.0.16svn75679-59.2.noarch.rpm"
RPM_HASH = "eac16bcfd9ed8d6229c9bdd0f9c9fb36d6543fdd3a63f108e640dfea8fdd5e184e84e09652d47fc6e117c014b6d380049f1fb035f688074334e3f3f0d892e13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luafindfont"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luafindfont-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
