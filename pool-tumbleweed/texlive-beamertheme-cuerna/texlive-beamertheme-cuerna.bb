SUMMARY = "A beamer theme with 4 colour palettes"
DESCRIPTION = "The package contains a theme for Beamer which is referenced as \
'Cuerna' inside beamer and has four basic colour themes. The \
title page shows rectangles that represent the Fibonacci \
sequence, and spiral is drawn on top of the rectangles. Besides \
that the rest of the graphic elements in the slides are scarce \
to keep it clean"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42161"

RPM_NAME = "texlive-beamertheme-cuerna-2026.226.svn42161-61.2.noarch.rpm"
RPM_HASH = "137397cc254bc2e1ee0b285c9a43d523ab92b4512c9ef29d27ece4a0714efe1146828de0da1ee4b250929f2a7284b5c120080d23742ba6c2ac202831330da593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeCuerna.sty \
tex-beamercolorthemebluesimplex.sty \
tex-beamercolorthemebrick.sty \
tex-beamercolorthemelettuce.sty \
tex-beamerinnerthemeCuerna.sty \
tex-beamerouterthemeCuerna.sty \
tex-beamerthemeCuerna.sty \
texlive-beamertheme-cuerna"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-graphicx.sty \
tex-lmodern.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
