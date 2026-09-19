SUMMARY = "A Lua module for parsing key-value options"
DESCRIPTION = "This package provides a Lua module that can parse key-value \
options like the TeX packages keyval, kvsetkeys, kvoptions, \
xkeyval, pgfkeys etc. luakeys, however, accomplishes this task \
entirely by using the Lua language and does not rely on TeX. \
Therefore this package can only be used with the TeX engine \
LuaTeX. Since luakeys uses LPeg, the parsing mechanism should \
be pretty robust."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.17.0svn78101"

RPM_NAME = "texlive-luakeys-2026.226.0.0.17.0svn78101-59.2.noarch.rpm"
RPM_HASH = "db389561171fb7ebc81ee641ca3f5a82c787e8056c8344a2369e482ede2ad841ea893265a94947aabab735ba46bd703663944895e60608d12e72fa17342f94a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luakeys-debug.sty \
tex-luakeys-debug.tex \
tex-luakeys.sty \
tex-luakeys.tex \
texlive-luakeys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
