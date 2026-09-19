SUMMARY = "Generate control diagrams"
DESCRIPTION = "The package uses TikZ to provide commands for generating \
control diagrams (specially in power electronics)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn22490"

RPM_NAME = "texlive-bloques-2026.226.1.0svn22490-59.2.noarch.rpm"
RPM_HASH = "ce26459f486b682d56c689745e568492400470d3bfb5d379bd0b920d4700a56cff7508728bab35faa5ac092b99ca53f0d4c0d0277e5a7af1158482b9b0186937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bloques.sty \
texlive-bloques"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
