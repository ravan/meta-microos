SUMMARY = "Visual identity of Huazhong University of Science and Technology"
DESCRIPTION = "The package provides a collection of visual identity assets for \
Huazhong University of Science and Technology (HUST), \
implemented using LaTeX3 and TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn76924"

RPM_NAME = "texlive-hustvisual-2026.226.1.0.0svn76924-60.2.noarch.rpm"
RPM_HASH = "c379dd5723193e252a25fded3b4160727ace49d39081392523d8738f885d8e5d41496112880b84ef7db51b6ec67cc5dfbef45fdf8b550b44a694ce5b51589e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hustvisual-vi-emblem.def \
tex-hustvisual-vi-horizontal-name-zh.def \
tex-hustvisual.sty \
texlive-hustvisual"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
