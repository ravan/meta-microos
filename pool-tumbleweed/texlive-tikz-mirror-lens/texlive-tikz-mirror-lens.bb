SUMMARY = "Spherical mirrors and lenses in TikZ"
DESCRIPTION = "This package allows the automatic drawing of the image of \
objects in spherical mirrors and lenses from the data of the \
focus, from the position and height of the object. It \
calculates the position and height of the image, and also \
displays the notable rays."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn65500"

RPM_NAME = "texlive-tikz-mirror-lens-2026.226.1.0.2svn65500-59.2.noarch.rpm"
RPM_HASH = "4e21409d92a6ded45a53aa147962d85e37efa79383543b027ef4052043d81171c6652eaf8f2029a04475a7a4e06ba2d2093b15a1b1d4d26d6c7a33e8b8b69097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-mirror-lens.sty \
texlive-tikz-mirror-lens"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
