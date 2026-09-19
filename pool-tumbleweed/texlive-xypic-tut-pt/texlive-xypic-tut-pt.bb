SUMMARY = "A tutorial for XY-pic, in Portuguese"
DESCRIPTION = "The xypic-tut-pt package"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-xypic-tut-pt-2026.226.svn15878-59.4.noarch.rpm"
RPM_HASH = "d81d1d4a0ec560bbcc64d3fc7e15754960202ba5087da3cf1f4c9c617a3d1500bf5b92c386dd60c69e113d149f4d9573440a045d3eb7612d9cbd74dbbb4635c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xypic-tut-pt"

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
