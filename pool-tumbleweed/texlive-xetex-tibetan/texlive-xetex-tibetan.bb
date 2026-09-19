SUMMARY = "XeTeX input maps for Unicode Tibetan"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Tibetan to Unicode (range 0F00-0FFF)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-2026.226.0.0.1svn28847-59.4.noarch.rpm"
RPM_HASH = "5c1e54d0b570b11bfd8731720011f2726a2e8368ecae78cd58babc780b1d10d8d0ccb67fea4d5b21f7e16c2e4d9b06072b9daab91fcee1685aab8f33934c40eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-loctib.map \
tex-wylie.map \
texlive-xetex-tibetan"

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
