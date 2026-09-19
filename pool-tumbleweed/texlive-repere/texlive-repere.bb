SUMMARY = "MetaPost macros for secondary school mathematics teachers"
DESCRIPTION = "This package provides MetaPost macros for drawing secondary \
school mathematics figures in a coordinate system: axis, grids \
points, vectors functions (curves, tangents, integrals, \
sequences) statistic diagrams plane geometry (polygons, \
circles) arrays and game boards"
LICENSE = "LPPL-1.0"

PV = "2026.226.23.05.bsvn66998"

RPM_NAME = "texlive-repere-2026.226.23.05.bsvn66998-60.4.noarch.rpm"
RPM_HASH = "620e23ef28609ad50d31270eb691892f78e71fb45eb3910b832d8d7b0a3a3591a0c7853f29753c50b663342c522b2e41c6e355c04343c2378794da2bef1264d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-repere"

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
