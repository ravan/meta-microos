SUMMARY = "Fonts Based on the Work of Firmin Didot and Richard Porson"
DESCRIPTION = "Lowercase upright Greek were designed in 1805 by Firmin Didot (1764 – 1836) and cut by Walfard and Vibert. The typeface, together with a complete printing house, was donated in 1821 to the new Greek state by Didot’s son, Ambroise Firmin Didot (1790 – 1876). Lowercase italic Greek were designed in 1802 by Richard Porson (1757 – 1808) and cut by Richard Austin. They were first used by Cambridge University Press in 1810. Capitals, Latin and Cyrillic, as well as the complete bold weights, have been designed in an attempt to create a well-balanced font. The font covers the Windows Glyph List, Greek Extended, various typographic extras and some Open Type features (Numerators, Denominators, Fractions, Old Style Figures, Historical Forms, Stylistic Alternates, Ligatures); it is available in regular, italic, bold and bold italic."
LICENSE = "SUSE-Permissive"

PV = "1.01"

RPM_NAME = "gdouros-alfios-fonts-1.01-3.27.noarch.rpm"
RPM_HASH = "cfdb71061ea8d3f4d969607e4e78cd45232c74b340d4e45c513ee13ba2a2a08fc96ffff6959f790895176c50174f4e231ce08b7f2ccc24cdac2d392c68f8a07b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alfios-fonts \
gdouros-alfios-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
