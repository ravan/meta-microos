SUMMARY = "Write on grid lines"
DESCRIPTION = "An environment to create grids (type 5x5 or Seyes or Ruled) and \
commands to write texts 'right' on the lines."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.9svn77353"

RPM_NAME = "texlive-writeongrid-2026.226.0.0.1.9svn77353-59.4.noarch.rpm"
RPM_HASH = "d5692a3af698ac6e3534b5d1afc8fc1b487c1af78784ddae07a82b3aed841c59c464564efdab0368113cda158f1bd11c8411b1d00669c58388aa95f5a154d027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-WriteOnGrid.sty \
texlive-writeongrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-setspace.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
