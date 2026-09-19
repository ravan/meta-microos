SUMMARY = "Bug fix for longtable"
DESCRIPTION = "A patch for LaTeX bugs tools/3180 and tools/3480. The patch \
applies to version 4.11 of longtable."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.74dsvn17533"

RPM_NAME = "texlive-ltabptch-2026.226.1.74dsvn17533-59.2.noarch.rpm"
RPM_HASH = "61141a1040f6cc3ae99f0e9bd4038c249cf65c907e18b86bc879803e4442e9305b7fa3f486514d1bcbb8ca653d7c2ed4b88eda60ea33d924dd250ea2c006b694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltabptch.sty \
texlive-ltabptch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
