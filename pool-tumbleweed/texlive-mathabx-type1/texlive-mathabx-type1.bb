SUMMARY = "Outline version of the mathabx fonts"
DESCRIPTION = "This is an Adobe Type 1 outline version of the mathabx fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21129"

RPM_NAME = "texlive-mathabx-type1-2026.226.svn21129-59.2.noarch.rpm"
RPM_HASH = "ecdb2d01894d0665494942af700f8f729a59ac27a0c1b38b4ad3bfc6416169358cb8150ee0b1d6bce6c59837585d73d3869d6f9af9b1dde7ba47da7eceb3389e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathabx.map \
texlive-mathabx-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mathabx \
texlive-mathabx-type1-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
