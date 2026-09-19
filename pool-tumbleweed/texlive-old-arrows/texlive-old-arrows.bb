SUMMARY = "Computer Modern old-style arrows with smaller arrowheads"
DESCRIPTION = "This package provides Computer Modern old-style arrows with \
smaller arrowheads, associated with the usual LaTeX commands. \
It can be used in documents that contain other amssymb arrow \
characters that also have small arrowheads. It is also possible \
to use the usual new-style Computer Modern arrows together with \
the old-style ones."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-old-arrows-2026.226.2.0svn77682-61.2.noarch.rpm"
RPM_HASH = "0eb5d2a43c640b32193691c89b469be76b0feaa34e83bacb9d7337e8be876ba77204b2a7e8c8712b5fa4347a7e8c350a6092f50edc6a0437886168e8ee90cf68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oabsy10.tfm \
tex-oabsy5.tfm \
tex-oabsy6.tfm \
tex-oabsy7.tfm \
tex-oabsy8.tfm \
tex-oabsy9.tfm \
tex-oasy.enc \
tex-oasy.map \
tex-oasy10.tfm \
tex-oasy5.tfm \
tex-oasy6.tfm \
tex-oasy7.tfm \
tex-oasy8.tfm \
tex-oasy9.tfm \
tex-old-arrows.sty \
texlive-old-arrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-old-arrows-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
