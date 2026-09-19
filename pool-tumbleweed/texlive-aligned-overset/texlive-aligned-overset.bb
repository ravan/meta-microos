SUMMARY = "Fix alignment at \\overset or \\underset"
DESCRIPTION = "This package allows the base character of \\underset or \\overset \
to be used as the alignment position for the amsmath aligned \
math environments."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn77682"

RPM_NAME = "texlive-aligned-overset-2026.226.0.0.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "5ed30b2c5fd5e5b5c5407e8a43c6d6a3c655087082593b39b536c46a0f633e52bc2bc947a6d94f245288f75458693160c3336bf9e4868a872099ab6c6c8da64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aligned-overset.sty \
texlive-aligned-overset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
