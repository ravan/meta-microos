SUMMARY = "Penlight Lua libraries made available to LuaLaTeX users"
DESCRIPTION = "This LuaLaTeX package provides a wrapper to use the penlight \
Lua libraries with LuaLaTeX, with some extra functionality \
added."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73362"

RPM_NAME = "texlive-penlight-2026.226.svn73362-58.2.noarch.rpm"
RPM_HASH = "7f590af23329f86b06d85c6f96030cfef7b568c62ddf467c2ded811684381c2ec106e98c7fd6fa9dde9ddaf5e1ff5ab54fb547ee44d1042378128efad908da0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-penlight.sty \
texlive-penlight"

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
