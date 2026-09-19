SUMMARY = "International Modal Analysis Conference format"
DESCRIPTION = "A set of files for producing correctly formatted documents for \
the International Modal Analysis Conference. The bundle \
provides a LaTeX package and a BibTeX style file."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn17347"

RPM_NAME = "texlive-imac-2026.226.svn17347-60.2.noarch.rpm"
RPM_HASH = "0d8cc180b30542fb5150af867c8d3cd2028b1506bb743d4d81c0285c3f298040c644e31a7cdef0cdcce8e0c3d95bbb3d4c665aa844c0d1b2dfe1ac7907c371be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-imac.sty \
texlive-imac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-cite.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
