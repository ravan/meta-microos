SUMMARY = "Images on a spherical mirror"
DESCRIPTION = "The package provides commands and supporting PostScript \
material for drawing images as if reflected by a spherical \
mirror."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02asvn71294"

RPM_NAME = "texlive-pst-mirror-2026.226.1.02asvn71294-59.2.noarch.rpm"
RPM_HASH = "e0f02fde0c2bf04fd66c74952da2b0d342169c294a5accc03770589df1a97841ace1fe66a411c942702b86527d42d44250e412fb4142e19b62c899877b672649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-mirror.sty \
tex-pst-mirror.tex \
texlive-pst-mirror"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
