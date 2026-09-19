SUMMARY = "Disk of Phaistos font"
DESCRIPTION = "A font that contains all the symbols of the famous Disc of \
Phaistos, together with a LaTeX package. The disc was 'printed' \
by stamping the wet clay with some sort of punches, probably \
around 1700 BCE. The font is available in Adobe Type 1 and \
OpenType formats (the latter using the Unicode positions for \
the symbols). There are those who believe that this Cretan \
script was used to 'write' Greek (it is known, for example, \
that the rather later Cretan Linear B script was used to write \
Greek), but arguments for other languages have been presented."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn18651"

RPM_NAME = "texlive-phaistos-2026.226.1.0svn18651-58.2.noarch.rpm"
RPM_HASH = "ddb253ec7e21254285a42258a38b65429f0b34d53c9cfdcef44fa98ddee508edbd7fca7652323b81e435a039db261e6024563ec99762d3013b007e3d117a4030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phaistos.map \
tex-phaistos.sty \
tex-phaistos.tfm \
texlive-phaistos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-phaistos-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
