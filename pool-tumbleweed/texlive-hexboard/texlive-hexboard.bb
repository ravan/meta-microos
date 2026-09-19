SUMMARY = "For drawing Hex boards and games"
DESCRIPTION = "hexboard is a package for LaTeX that should also work with \
LuaTeX and XeTeX, that provides functionality for drawing Hex \
boards and games. The aim is a clean, clear design with \
flexibility for drawing different sorts of Hex diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn62102"

RPM_NAME = "texlive-hexboard-2026.226.1.0svn62102-60.4.noarch.rpm"
RPM_HASH = "080e357eb321ebd05e0e6ebe18944225ab433b66488524985f06efc1180bee345bbefa64771490b08c07541f53ddc27cd2b13789ebde61646a0b53713c2334c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hexboard.sty \
texlive-hexboard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
