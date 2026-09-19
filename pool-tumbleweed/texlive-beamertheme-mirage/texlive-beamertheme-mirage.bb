SUMMARY = "A beamer theme with dark and light colour schemes"
DESCRIPTION = "A beamer theme inspired by the album art of Zhou Shen's song \
Mirage, with a default dark and alternative light mode. Sample \
.tex files for beamer presentations and posters are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn73516"

RPM_NAME = "texlive-beamertheme-mirage-2026.226.1.1.1svn73516-61.2.noarch.rpm"
RPM_HASH = "26dde2048d2f51c81ef1c1f64a30fc3cb751d901cb629148a29a2494f02c6aab8b20af7179e40d87118cc796c343cf85784c905870865826b02329686ce9b83d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeMirage.sty \
texlive-beamertheme-mirage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontawesome5.sty \
tex-microtype.sty \
tex-regexpatch.sty \
tex-relsize.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
