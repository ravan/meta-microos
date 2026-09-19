SUMMARY = "Flat geometry with MetaPost"
DESCRIPTION = "This package was written with the aim of providing MetaPost \
macros for creating a geometry figure that closely matches an \
imperative description: Let A be the point with coordinates \
(2,3). Let B be the point with coordinates (4,5). Draw the line \
(A, B). ..."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77019"

RPM_NAME = "texlive-mp-geom2d-2026.226.1.4svn77019-61.2.noarch.rpm"
RPM_HASH = "51aa1769ab36ceb0db97f18c146d1dafee95236e7fbb6b9cd187328437470a0a72899b669107de9c52a69b46ef73b6f15bf7d8a9021a3ff0d02695552cc17350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mp-geom2d"

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
