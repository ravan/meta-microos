SUMMARY = "Draw pie-charts using MetaPost"
DESCRIPTION = "The piechartmp package is an easy way to draw pie-charts with \
MetaPost. The package implements an interface that enables \
users with little MetaPost experience to draw charts. A \
highlight of the package is the possibility of suppressing some \
segments of the chart, thus creating the possibility of several \
charts from the same data."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn19440"

RPM_NAME = "texlive-piechartmp-2026.226.0.0.3.0svn19440-58.2.noarch.rpm"
RPM_HASH = "11d74567d53fe9942f8b96298202891bbdd753346714db01c79f7d6f5c4753de525cb5fd65daf3020f0ae8317db55b16ab0d480a7778e85b98b637e137eaf94f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piechartmp"

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
