SUMMARY = "Add colour to LaTeX tables"
DESCRIPTION = "The package allows rows and columns to be coloured, and even \
individual cells."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0ksvn77682"

RPM_NAME = "texlive-colortbl-2026.226.1.0ksvn77682-60.2.noarch.rpm"
RPM_HASH = "a7710b9414008fd135ff7caa877239df47dcc02fd542a503b1b56327e1b0906859cf6919cee72f783bd27f7a69ccb8691befe08dd04d3850ab7d8a84905f5732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colortbl.sty \
texlive-colortbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
