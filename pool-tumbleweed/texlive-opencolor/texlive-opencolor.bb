SUMMARY = "Definitions from the Open Color library"
DESCRIPTION = "This package provides hexadecimal color definitions of the 130 \
colors included in the Open Color library."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn66363"

RPM_NAME = "texlive-opencolor-2026.226.1.0.1svn66363-61.2.noarch.rpm"
RPM_HASH = "71934e34d53955a4308c353db3c16036aad7912e50999efd61a10e022930a6b8cfa3f5506eeec74366a5225ce72cda114221be6e4bcfa58d3dab58e99eee495f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-opencolor.sty \
texlive-opencolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
