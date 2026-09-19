SUMMARY = "Generation of seating charts"
DESCRIPTION = "This package enables the visualization of seating charts, \
whereby the seating layouts (i.e. the arrangement of seats in a \
room) and the seating scheme (i.e. the selection and labeling \
of occupied seats) can be controlled independently of each \
other. The package should be considered experimental and \
requires LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn76924"

RPM_NAME = "texlive-seatingchart-2026.226.0.0.5.0svn76924-60.2.noarch.rpm"
RPM_HASH = "0eb5706603634fbe1dde1307cec4fb86cfde300c95c49dcc8ccf2acb475a385d4adbc4a705b6f9132313c576742b49047a10b953cdef30a738b1be1e253c6d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seatingchart.sty \
texlive-seatingchart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-luacode.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
