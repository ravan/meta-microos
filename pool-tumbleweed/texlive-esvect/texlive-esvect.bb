SUMMARY = "Vector arrows"
DESCRIPTION = "Write vectors using an arrow which differs from the Computer \
Modern one. You have the choice between several kinds of \
arrows. The package consists of the relevant Metafont code and \
a package to use it."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-esvect-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "e989501270021a5efe21e35843e420f4849107e01c5afc199773ce6b01d2c7a04e62c764724eaf023c9313da3c3f67d9a42153ca05cdabb67f77c44efa57a2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esvect.map \
tex-esvect.sty \
tex-uesvect.fd \
tex-vect10.tfm \
tex-vect5.tfm \
tex-vect6.tfm \
tex-vect7.tfm \
tex-vect8.tfm \
tex-vect9.tfm \
texlive-esvect"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-esvect-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
