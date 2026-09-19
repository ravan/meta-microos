SUMMARY = "Print a typographic grid"
DESCRIPTION = "Draws a grid on every page of the document; the grid divides \
the page into columns, and may be used for fixing measurements \
of layout."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21svn24994"

RPM_NAME = "texlive-typogrid-2026.226.0.0.21svn24994-59.2.noarch.rpm"
RPM_HASH = "cc99b9cc13a3f812ecc03975af6e6c3a70366fee1a3494d334629e283aafb361264f8f8c5f6ff17a61ce48b350617a83311ed3865e877c2196208f88a627ba5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typogrid.sty \
texlive-typogrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eso-pic.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
