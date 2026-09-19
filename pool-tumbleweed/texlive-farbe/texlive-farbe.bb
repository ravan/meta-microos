SUMMARY = "Color management (conversion, names) for LuaTeX implemented in Lua"
DESCRIPTION = "This package is mainly a Lua library for converting and \
manipulating colors. It is based on Lua module lua-color."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn75449"

RPM_NAME = "texlive-farbe-2026.226.0.0.2.0svn75449-59.2.noarch.rpm"
RPM_HASH = "88a6776fc05d6a3e7d3f92fe03fb3a3c00c59843b9d50850bf7ea466e67805534c3c3ad59127ddfac202eb0897405094ce4c5ffd4783dab270a87d41fc861ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-farbe.sty \
tex-farbe.tex \
texlive-farbe"

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
