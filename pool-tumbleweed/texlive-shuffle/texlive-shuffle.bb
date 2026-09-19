SUMMARY = "A symbol for the shuffle product"
DESCRIPTION = "The bundle provides a LaTeX package and a font (as Metafont \
source) for the shuffle product which is used in some part of \
mathematics and physics."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-shuffle-2026.226.1.0svn78101-60.2.noarch.rpm"
RPM_HASH = "9449b1d38534bbd3d528079bec2bb6bf183cf10ce9416bb50a79d663fc6941678578b21fd87608f2ddd2548a753e0713c46a63ff86aeeae35aa868538db00b1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ushuffle.fd \
tex-shuffle.sty \
tex-shuffle10.tfm \
tex-shuffle7.tfm \
texlive-shuffle"

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
