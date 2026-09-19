SUMMARY = "Draw Grafcet/SFC with TikZ"
DESCRIPTION = "The package provides a library (GRAFCET) that can draw Grafcet \
Sequential Function Chart (SFC) diagrams, in accordance with EN \
60848, using Pgf/TikZ. L'objectif de la librairie GRAFCET est \
de permettre le trace de grafcet selon la norme EN 60848 a \
partir de Pgf/TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-2026.226.1.3.5svn22509-60.4.noarch.rpm"
RPM_HASH = "27b251cf617e97ff6c90e1c43000f2a64eb4165f1f9cb82656c95ef4f3ca09f07aa78009fb06e598c976deae487c2707bee74ddb32d1c2e20c9a6f5fa386e458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grafcet.sty \
texlive-grafcet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifsym.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
