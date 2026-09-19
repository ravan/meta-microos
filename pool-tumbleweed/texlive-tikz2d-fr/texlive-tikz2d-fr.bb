SUMMARY = "Work with some 2D TikZ commands (French)"
DESCRIPTION = "This is a small package to work with some (French) 2D commands \
for TikZ: 'freehand style' mainlevee define and mark points \
\\DefinirPoints, \\MarquerPoints draw colored segments \
\\TracerSegments"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-tikz2d-fr-2026.226.0.0.1.1svn73069-59.2.noarch.rpm"
RPM_HASH = "ad1d4f49c7bc8c5d889ce50985dac21a65a80de8e759ec65cd107bcf1cbcf9e38b582eda9fe8112a2b5a953eb7ee09caebd594e73a36408cc320d81c3160a45f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz2d-fr.sty \
texlive-tikz2d-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listofitems.sty \
tex-pgffor.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
