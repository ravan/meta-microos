SUMMARY = "Underlining for LuaLaTeX"
DESCRIPTION = "This package provides underlining, strikethough, and \
highlighting using features in LuaLaTeX which avoid the \
restrictions imposed by other methods. In particular, kerning \
is not affected, the underlined text can use arbitrary \
commands, hyphenation works etc. The package requires LuaTeX \
version [?] 1.12.0."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn77682"

RPM_NAME = "texlive-lua-ul-2026.226.0.0.2.1svn77682-59.2.noarch.rpm"
RPM_HASH = "b7a671b92d73f155caf08796405dea2c3c9b9d8ee7d0455ae4797147626a8a3fd81c258aa676508283cc92c62d610cc2c8ca553fcafc9047f606f169e4442762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docstrip-luacode.sty \
tex-lua-ul.sty \
texlive-lua-ul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luacolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
