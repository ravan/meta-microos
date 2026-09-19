SUMMARY = "Additional Lua functions for LuaTeX macro programmers"
DESCRIPTION = "Lualibs is a collection of Lua modules useful for general \
programming. The bundle is based on lua modules shipped with \
ConTeXt, and made available in this bundle for use independent \
of ConTeXt."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.76svn67994"

RPM_NAME = "texlive-lualibs-2026.226.2.76svn67994-59.2.noarch.rpm"
RPM_HASH = "cae798e692d3c7e715386a01e7b19f737f3b6237c8f9d652897866c5ae70cad0ca202241785aaa0787b03793dce36c94f5628f22cee9938f826dea57b8d2ba6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualibs"

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
texlive-scripts \
texlive-scripts-bin"

inherit rpm
