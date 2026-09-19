SUMMARY = "A template for printing presentations on notepaper"
DESCRIPTION = "This package provides an easy way to input slides on note pages \
quickly, developed by expl3 based on TikZ and l3graphics."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6asvn77682"

RPM_NAME = "texlive-notebeamer-2026.226.4.6asvn77682-61.2.noarch.rpm"
RPM_HASH = "dcc9af44d76506161f22f8ea9a4742e93361aec0afd737b9ffe7a5f2737b1da412f3ee96f606c0363553de9f018abd2b701c31c76bc67805bbbbf0e187547ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-notebeamer.sty \
texlive-notebeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-tikzpagenodes.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
