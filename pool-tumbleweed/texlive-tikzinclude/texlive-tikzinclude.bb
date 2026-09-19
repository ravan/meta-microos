SUMMARY = "Import TikZ images from colletions"
DESCRIPTION = "The package addresses the problem of importing only one \
TikZ-image from a file holding multiple images."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn28715"

RPM_NAME = "texlive-tikzinclude-2026.226.1.0svn28715-59.2.noarch.rpm"
RPM_HASH = "0cf644259803341e913e7996e3dec3beb9e51ad592ae0cd5ad479eead85bb24c8ad9b995c69a939037ba58dda4be7c53649bc3865b0706fe58e66237cb5ad3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzinclude.sty \
texlive-tikzinclude"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
