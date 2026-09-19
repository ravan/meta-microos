SUMMARY = "LaTeX commands for the French game 'Mathador'"
DESCRIPTION = "This is a LaTeX package with graphic commands for the French \
game MATHADOR (by author Eric Trouillot and Reseau CANOPE). The \
principle of the game is like this: Roll the dice! They give \
you one target number (between 0 and 99) and five numbers to \
use to reach it. You can use the four arithmetic operations to \
get there."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76924"

RPM_NAME = "texlive-mathador-2026.226.0.0.1.1svn76924-59.2.noarch.rpm"
RPM_HASH = "ac1495db1e4bb9828d4c3d4bb0964bb40b8d46982e8fab1d4e070d15860d47e4b2037d508bcab713ac85d752ecc465e1b5ec22cc207168ceb62c2eeb17d9ab68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathador.sty \
texlive-mathador"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bm.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-simplekv.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
