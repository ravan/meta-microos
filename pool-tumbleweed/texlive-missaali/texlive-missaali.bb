SUMMARY = "A late medieval OpenType textura font"
DESCRIPTION = "This package contains the free OpenType Textura font Missaali \
and a style file for using it with XeLaTeX. Textura is a \
typeface based on the textus quadratus form of the textualis \
formata that late medieval scribes used for the most valuable \
manuscripts. The font Missaali is based on Textura that German \
printer Bartholomew Ghotan used for printing missals and \
psalters in the 1480s. This font has two intended use cases: as \
a Gothic display font; and for emulating late-medieval \
manuscripts. In addition to the basic textura letters, the font \
contains a large number of abbreviation sigla as well as a set \
of Lombardic initials. As modern typesetting algorithms are not \
intended for creating 15th century style layout, the package \
contains a XeLaTeX style file that makes it easier to achieve \
the classic incunabula look."
LICENSE = "OFL-1.1"

PV = "2026.226.2.0svn61719"

RPM_NAME = "texlive-missaali-2026.226.2.0svn61719-61.2.noarch.rpm"
RPM_HASH = "32e1c88586ad96d6a31081830dbd1ebc121e65bce6801259f4860c701bce83d7aa5d4e7afe6904e962db61a3aca62f1c5886efca45111e85f466faade7b571cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-missaali.sty \
texlive-missaali"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-calc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-missaali-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
