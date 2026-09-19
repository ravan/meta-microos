SUMMARY = "Christmas silliness (Latin)"
DESCRIPTION = "This is the plain TeX file xii-lat.tex. Call 'pdftex \
xii-lat.tex' to produce a (perhaps) surprising typeset \
document."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45805"

RPM_NAME = "texlive-xii-lat-2026.226.svn45805-59.4.noarch.rpm"
RPM_HASH = "805d4ec35688bb2dd330657c797b9aac08e550262624448e80f029ab25f7feebcb060a6b97cdad8b74fa7d9617f12db9edb8b406b38be3cfdc2395f38ecc5514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xii-lat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
