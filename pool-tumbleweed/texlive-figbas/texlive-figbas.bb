SUMMARY = "Mini-fonts for figured-bass notation in music"
DESCRIPTION = "This package consists of three mini-fonts (and associated \
metrics) of conventional ligatures for the figured-bass \
notations 2+, 4+, 5+, 6+ and 9+ in music manuscripts. The fonts \
are usable with Computer Modern Roman and Sans, and \
Palatino/Palladio, respectively."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.3svn28943"

RPM_NAME = "texlive-figbas-2026.226.1.0.3svn28943-59.2.noarch.rpm"
RPM_HASH = "544c03a74d5b8822c3409188a2b22a61c5177fd0e9cfc80e477a546e0c204bbe4a1fb0a6f2ddbd9ece9b9bfca8edc60a667038af8e589349e992efc733e3178e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmrj.tfm \
tex-cmssj.tfm \
tex-figbas.map \
tex-plrj.tfm \
texlive-figbas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-figbas-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
