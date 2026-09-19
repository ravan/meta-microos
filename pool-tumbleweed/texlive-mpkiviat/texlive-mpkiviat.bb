SUMMARY = "MetaPost package to draw Kiviat diagrams"
DESCRIPTION = "This MetaPost package allows to draw Kiviat diagrams (or radar \
chart, web chart, spider chart, etc.)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn75712"

RPM_NAME = "texlive-mpkiviat-2026.226.0.0.1svn75712-61.2.noarch.rpm"
RPM_HASH = "037b5ad0e41c2f20e734c9268972681baac7f82334e67810846b088cf98641ba0f23adfbc9d765492e977a70e8151b43fb15bbb8845bd6635fd361811a80ec90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpkiviat"

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
