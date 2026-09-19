SUMMARY = "A simple template for drawing playcards"
DESCRIPTION = "This small package provides commands for drawing customized \
playcards with width 59mm and height 89mm, which are typical \
card dimensions."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.0.0.2.1svn67342"

RPM_NAME = "texlive-playcards-2026.226.0.0.2.1svn67342-59.2.noarch.rpm"
RPM_HASH = "1b028186e4825134552493cb56482c625b6a117a185de3526a06d319decdbe1fbf6f5c555071d0b7966478617c52cc1c5f68479de40960ca31966f8138eddc12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-playcards.sty \
texlive-playcards"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-contour.sty \
tex-graphicx.sty \
tex-simplekv.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
