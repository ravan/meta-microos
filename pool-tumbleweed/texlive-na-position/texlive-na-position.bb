SUMMARY = "Tables of relative positions of curves and asymptotes or tangents in Arabic documents"
DESCRIPTION = "This package facilitates, in most cases, the creation of tables \
of relative positions of a curve and its asymptote, or a curve \
and a tangent in one of its points. It depends on tkz-tab and \
listofitems, as well as amsmath, amsfonts, mathrsfs, and \
amssymb. This package has to be used with polyglossia and \
XeLaTeX to produce documents in Arabic."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn55559"

RPM_NAME = "texlive-na-position-2026.226.1.2svn55559-61.2.noarch.rpm"
RPM_HASH = "9d3a167383db7c1d6cb38ca4ad1974ebed86deb9feaa9452e8c034fd5d8e512d6deeddda8a0ab12b431d870b8f6729ad004aa417a62c1bb663f054510b6c9851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-na-position.sty \
texlive-na-position"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tkz-tab.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
