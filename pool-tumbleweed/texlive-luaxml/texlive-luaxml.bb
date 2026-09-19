SUMMARY = "Lua library for reading and serialising XML files"
DESCRIPTION = "LuaXML is a pure Lua library for reading and serializing XML \
files. The current release is aimed mainly at support for the \
odsfile package. The documentation was created by automatic \
conversion of original documentation in the source code."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn78101"

RPM_NAME = "texlive-luaxml-2026.226.0.0.2csvn78101-59.2.noarch.rpm"
RPM_HASH = "24f6ba9e0f64b7fe00cd441e24c87337b7324e2ca85af02da0969eeea39a0c2f9ba51631a80913f434a165a889c351d030d8d2f6643c8213bf1fd9a000aeeca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaxml.sty \
texlive-luaxml"

RDEPENDS:${PN} += "/usr/bin/lua \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
