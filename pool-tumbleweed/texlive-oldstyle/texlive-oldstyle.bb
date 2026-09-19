SUMMARY = "Old style numbers in OT1 encoding"
DESCRIPTION = "Font information needed to load the cmmi and cmmib fonts for \
use to produce oldstyle numbers."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-oldstyle-2026.226.0.0.2svn15878-61.2.noarch.rpm"
RPM_HASH = "e1217c22013a3797e69b23021f7bfed02db745feff83dab87682364f0bda12e1fdcc833fcdf22807874420a3c0ad609823abc57d2ce73677413f7fc1c32027e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ucmm.fd \
tex-oldstyle.sty \
texlive-oldstyle"

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
