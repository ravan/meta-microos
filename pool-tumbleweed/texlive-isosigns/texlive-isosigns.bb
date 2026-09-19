SUMMARY = "ISO signs and colors according to the standards 7001, 7010 and 3864"
DESCRIPTION = "The package provides safety colors (ISO 3864), safety signs \
(ISO 7010), and public information symbols (ISO 7001) from the \
ISO. It can be useful when creating instructions for chemical \
or physical experiments. Note: This is not an official package \
from ISO."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn76196"

RPM_NAME = "texlive-isosigns-2026.226.2.1svn76196-63.2.noarch.rpm"
RPM_HASH = "ff7c6e196e02167b947fd36cc43838ef5ea63d3c3baa4439a0ebcb6dcc16b29ef27cd20bca963514bf3936e1caa2cf2270e01aa4c793bf57f505c0942a7a7788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isosigns.sty \
texlive-isosigns"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
