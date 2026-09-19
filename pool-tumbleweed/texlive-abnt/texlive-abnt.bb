SUMMARY = "Typesetting academic works according to ABNT rules"
DESCRIPTION = "The ABNT package provides a clean and practical implementation \
of the ABNT rules for academic texts. Its purpose is to be as \
simple and user-friendly as possible."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55471"

RPM_NAME = "texlive-abnt-2026.226.svn55471-61.2.noarch.rpm"
RPM_HASH = "3bdea8ac2e52f785bd998884c7f70ce3176fb0aa58f7f01dbea8fbdc650fc1bd5a121ca8c9f15e44980e850ea5fe71dbf69ff7f68c6b978ad61c07d29e09193b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abnt.sty \
texlive-abnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-chngcntr.sty \
tex-emptypage.sty \
tex-enumerate.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-newfloat.sty \
tex-scrlayer-scrpage.sty \
tex-setspace.sty \
tex-tocbasic.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
