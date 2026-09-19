SUMMARY = "The 'real' way to transpose a Matrix"
DESCRIPTION = "With realtranspose you can notate the transposition of a matrix \
by rotating the symbols 90 degrees. This is an homage to the \
realhats package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-realtranspose-2026.226.1.1svn76924-60.4.noarch.rpm"
RPM_HASH = "e8a0badf9d6e244cd831964adb153a351862dd7b0125e4d4d067a60b455fd49010854d6b42d261a400ea9c048f5735b7a1fa389d88c1b5f6dfbf6bb0003d1db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realtranspose.sty \
texlive-realtranspose"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
