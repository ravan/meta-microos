SUMMARY = "Automatic computation of bounding boxes with PiCTeX"
DESCRIPTION = "This package makes PiCTeX recognize lines and arcs in \
determining the 'bounding box' of a picture. (PiCTeX so far \
accounted for put commands only). The 'bounding box' is \
essential for proper placement of a picture between running \
text and margins and for keeping the running text away."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn59552"

RPM_NAME = "texlive-autoarea-2026.226.0.0.3asvn59552-60.2.noarch.rpm"
RPM_HASH = "b400fe46119c44bd642e1152364e3eba2d4d4b952e6f73660dd5cc668f906c5ad035305ffe0354acd8bb04e28dc1c872af69b654fc45233699949c40f85ab452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autoarea.sty \
texlive-autoarea"

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
