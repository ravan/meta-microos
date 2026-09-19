SUMMARY = "Create index using LuaLaTeX"
DESCRIPTION = "Luaindex provides (yet another) index processor, written in \
Lua."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1bsvn25882"

RPM_NAME = "texlive-luaindex-2026.226.0.0.1bsvn25882-59.2.noarch.rpm"
RPM_HASH = "f3d3ccfe976b231a8b5ea736d1f6119260bb7df322b2616cfc4de0886c90fd785824e73c0ad6c7986b1dc6e83220d7defae9c09499a7dae70f946f95e2176de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaindex.sty \
texlive-luaindex"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase-compat.sty \
tex-luatexbase-modutils.sty \
tex-scrbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
