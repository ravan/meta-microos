SUMMARY = "Platonic solids in PSTricks"
DESCRIPTION = "The package adds to PSTricks the ability to draw 3-dimensional \
views of the five Platonic solids."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-2026.226.0.0.01svn16538-60.4.noarch.rpm"
RPM_HASH = "2d669c4b5ab14d7d98ee85d43ceadfe0156b855948c8d306ddb88a700149cf553b57fca08dea381f0991956ccee478987db3552ae7043cd92203e43d2c7d5972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-platon.sty \
texlive-pst-platon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-3d.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
