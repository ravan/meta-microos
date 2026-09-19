SUMMARY = "A copy of apalike.bst with German localization"
DESCRIPTION = "A copy of apalike.bst (which is part of the base BibTeX \
distribution) with German localization."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-apalike-german-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "626d35d109cf6f14e34e91b7eb1628a5fd8f747cf9c5109c023b33a3b380541c1b615ed5242264e8073e217a64e4a202e353b987c1490a6c0ee040e6348365d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-german"

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
