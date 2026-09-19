SUMMARY = "An ASCII wall chart"
DESCRIPTION = "The document may be converted between Plain TeX and LaTeX \
(2.09) by a simple editing action."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20536"

RPM_NAME = "texlive-ascii-chart-2026.226.svn20536-60.2.noarch.rpm"
RPM_HASH = "1975e9f101579031c6e740a01bade347184c4628702c21e1b47a84f4e24c3b4cf73f3df04be8f8360cde69cc6255340aa6f1318da1f03304668312784c3f2355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ascii-chart"

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
