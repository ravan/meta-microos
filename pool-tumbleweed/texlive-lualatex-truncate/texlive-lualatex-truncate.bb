SUMMARY = "A wrapper for using the truncate package with LuaLaTeX"
DESCRIPTION = "This package provides a wrapper for the truncate package, thus \
fixing issues related to LuaTeX's hyphenation algorithm."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn67201"

RPM_NAME = "texlive-lualatex-truncate-2026.226.1.1svn67201-59.2.noarch.rpm"
RPM_HASH = "27642106d46ccaa3f7ce781f738d35d7e44f149fee5c542eb1f72ad2ce1a2697a9d0eb2ce01f66d8f961b4a13b7e5aab6af631ce8e73de8ea16b0a5cc3c6512d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lualatex-truncate.sty \
texlive-lualatex-truncate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-letltxmacro.sty \
tex-truncate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
