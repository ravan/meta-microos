SUMMARY = "OTF conversion of Yannis Haralambous' Old German decorative initials"
DESCRIPTION = "This package is a conversion of the yinit font into OTF. \
Original Metafont files for yinit are in the yinit package."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-2026.226.1.0svn40207-59.4.noarch.rpm"
RPM_HASH = "7550aa6d4d2ef9f9fa86b6ab4567a5cb92a090c326928326d045a8b0a8967116cb5c29737633b233b8525d05966a04ebfa2bd8bdb05a4dbf2b42627976296ec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yinit-otf"

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
texlive-scripts-bin \
texlive-yinit-otf-fonts"

inherit rpm
