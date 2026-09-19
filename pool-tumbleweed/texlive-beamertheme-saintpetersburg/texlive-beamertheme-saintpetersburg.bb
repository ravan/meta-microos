SUMMARY = "A beamer theme that incorporates colours and fonts of Saint Petersburg State University"
DESCRIPTION = "This minimalistic beamer theme incorporates Saint Petersburg \
State University colours and fonts. It is suitable for both \
presentations and posters."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45877"

RPM_NAME = "texlive-beamertheme-saintpetersburg-2026.226.svn45877-61.2.noarch.rpm"
RPM_HASH = "de246a5d2e8175ba151344934027db7357828dec356b490ba334511436bbdbf676f8f061006b4d2b766edc5718562a2ff7ca5d8f499d6e3527254cbcf2418425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeSaintPetersburg.sty \
tex-beamerfontthemeSaintPetersburg.sty \
tex-beamerthemeSaintPetersburg.sty \
texlive-beamertheme-saintpetersburg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraMono.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-ifxetex.sty \
tex-opensans.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
