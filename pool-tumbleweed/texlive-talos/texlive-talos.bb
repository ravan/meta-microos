SUMMARY = "A Greek cult font from the eighties"
DESCRIPTION = "A cult Greek font from the eighties, used at the University of \
Crete, Greece. It belonged to the first TeX installation in a \
Greek University and most probably the first TeX installation \
that supported the Greek language."
LICENSE = "LPPL-1.3c"

PV = "2026.227.1.0svn61820"

RPM_NAME = "texlive-talos-2026.227.1.0svn61820-62.2.noarch.rpm"
RPM_HASH = "e17ea6a40db8eca37f0fbad6211d1d4b13ae18b0d2cac81cda6cbd096e45bc6d64b9b0adcaa9b49e777ee6589336cdb9641b740d32fad5f3868b693c9a5c711e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-talos"

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
texlive-talos-fonts"

inherit rpm
