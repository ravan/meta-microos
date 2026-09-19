SUMMARY = "A font for Frege's Grundgesetze der Arithmetik"
DESCRIPTION = "The fonts are provided as Metafont source and Adobe Type 1 \
(pfb) files. A small LaTeX package (fge) is included."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.25svn77682"

RPM_NAME = "texlive-fge-2026.226.1.25svn77682-59.2.noarch.rpm"
RPM_HASH = "d99c89dcf1ce23c8b67b476fcc011b063d6ff221fc0271b92db4579e68a7dc544309922f35712362de96496ec83736bd9939c0d06f260ba1c793af391b6702b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ufgeit.fd \
tex-Ufgerm.fd \
tex-fge.cfg \
tex-fge.map \
tex-fge.sty \
tex-fgeit10.tfm \
tex-fgerm10.tfm \
texlive-fge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-fge-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
