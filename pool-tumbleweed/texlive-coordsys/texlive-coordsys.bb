SUMMARY = "Draw cartesian coordinate systems"
DESCRIPTION = "The package provides commands for typesetting number lines \
(coordinate axes), coordinate systems and grids in the picture \
environment. The package may be integrated with other drawing \
mechanisms: the documentation shows examples of drawing graphs \
(coordinate tables created by Maple), using the eepic package's \
drawing capabilities."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn15878"

RPM_NAME = "texlive-coordsys-2026.226.1.4svn15878-61.2.noarch.rpm"
RPM_HASH = "ca87a4e70819c9b82836bc72090957d081abc1b4cf661678142cc6ce2b9cb330316f209b5f2c30933eddd84abc4a8717cf5abd4848cb5de7d1fcadcd4ae62277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coordsys.sty \
tex-logsys.sty \
texlive-coordsys"

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
