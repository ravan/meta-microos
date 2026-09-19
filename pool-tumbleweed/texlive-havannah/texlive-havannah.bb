SUMMARY = "Diagrams of board positions in the games of Havannah and Hex"
DESCRIPTION = "This package defines macros for typesetting diagrams of board \
positions in the games of Havannah and Hex."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn36348"

RPM_NAME = "texlive-havannah-2026.226.svn36348-60.4.noarch.rpm"
RPM_HASH = "aa110594b2d4729ac6d65026a5cd457d0917a5df093995a95b012f52139e159f90797fe43e9021ae0520ea60f8136ca51044ae288266fb7f2751cc71e524cca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-havannah.sty \
texlive-havannah"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
