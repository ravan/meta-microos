SUMMARY = "Select colors with proper WCAG color contrast"
DESCRIPTION = "This package carefully selects and defines 9 colors for 13 hues \
each. All colors with the same suffix number have equal \
luminance level. Also the color black is of level 0, and the \
color white is of level 10. By simply choosing two colors in \
the above list, which differ in level by at least 5, as \
foreground and background colors, you will get proper WCAG \
Color Contrast."
LICENSE = "LPPL-1.0"

PV = "2026.226.2022dsvn76924"

RPM_NAME = "texlive-ninecolors-2026.226.2022dsvn76924-61.2.noarch.rpm"
RPM_HASH = "049d6428c8ae0c8477af5210a723fa2de6c8e519662ef6df2cf098e4807b8133c061a428cd65465a8348f98b4cda66cf499a1605f8f2767c28c57d15c40e38d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ninecolors.sty \
texlive-ninecolors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
