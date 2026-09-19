SUMMARY = "Allow hyperref and natbib to work together"
DESCRIPTION = "Allows hyperref package and the natbib package with options \
'numbers' and 'sort&compress' to work together. This means that \
multiple sequential citations (e.g [3,2,1]) will be compressed \
to [1-3], where the '1' and the '3' are (color-)linked to the \
bibliography."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0bsvn17358"

RPM_NAME = "texlive-hypernat-2026.226.1.0bsvn17358-60.2.noarch.rpm"
RPM_HASH = "caf6111fbd8a956382f6459f2ec2a727e2b4fb5d21f95372c0499ab2a7a3a1e1a5db15a2360c9b6fb184b38c8f4cc4fbf9723ed1441bdfeb08961d44d31edee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypernat.sty \
texlive-hypernat"

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
