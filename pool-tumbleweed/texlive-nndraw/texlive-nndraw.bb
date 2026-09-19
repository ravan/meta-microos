SUMMARY = "Draw neural networks"
DESCRIPTION = "With this package you can create fully connected neural \
networks in a simple and efficient way."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn59674"

RPM_NAME = "texlive-nndraw-2026.226.1.0svn59674-61.2.noarch.rpm"
RPM_HASH = "3a04232d639b38771795dad8a2ce23dfb79505a334b45394783dda7fe0b7260f92ae954542b2610c9cf9c5e144cf6065156043feb8634ab7d6cac0960b3f074c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nndraw.sty \
texlive-nndraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
