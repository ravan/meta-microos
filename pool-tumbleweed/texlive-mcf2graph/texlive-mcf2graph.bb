SUMMARY = "Draw chemical structure diagrams with MetaPost"
DESCRIPTION = "The Molecular Coding Format (MCF) is a linear notation for \
describing chemical structure diagrams. This package converts \
MCF to graphic files using MetaPost."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.29svn76506"

RPM_NAME = "texlive-mcf2graph-2026.226.5.29svn76506-59.2.noarch.rpm"
RPM_HASH = "9ebf76f0cab6914e2f474e68702106a5f0ec60c3642c98c30cad23a51414014c4672fc0a0c94099deaf560bc435544405ff6176f29d2c0b3d634f1d95ba39099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcf2graph"

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
