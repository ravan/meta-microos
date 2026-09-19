SUMMARY = "Line numbering in LuaTeX-based formats"
DESCRIPTION = "The package provides flexible line numbering for LuaTeX-based \
formats. It supports OpTeX, LuaLaTeX, and Plain LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77766"

RPM_NAME = "texlive-lualineno-2026.226.0.0.1svn77766-59.2.noarch.rpm"
RPM_HASH = "bf9868e6dee2176884517d28eec9a720b293f3386336ece3940859eeb40e512fb0ea706c2d1f2960e720ffbbc385cace1b23b906ad2bb9fada2fcb33959bdced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lualineno.sty \
texlive-lualineno"

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
