SUMMARY = "A Unicode font table generator"
DESCRIPTION = "This package produces font tables for unicode fonts as well as \
for 8bit fonts. The table layout can be adjusted in various \
ways including restricting the range of output to show only a \
portion of a specific font. To quickly produce a one-off table \
there is a stand-alone version unicodefont.tex that asks you a \
few questions and then generates the table --- somewhat similar \
to nfssfont.tex for 8-bit fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0ksvn77682"

RPM_NAME = "texlive-unicodefonttable-2026.226.1.0ksvn77682-60.2.noarch.rpm"
RPM_HASH = "371328e4f99d1b6b7c5d10b9fd78870b25c47c28a756f22050787e540e379d60b0d3cb8288e98850b1c2352429c16685751085b47d145753227402d6cefbb44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicodefont.tex \
tex-unicodefonttable.sty \
texlive-unicodefonttable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-caption.sty \
tex-fontspec.sty \
tex-l3keys2e.sty \
tex-longtable.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
