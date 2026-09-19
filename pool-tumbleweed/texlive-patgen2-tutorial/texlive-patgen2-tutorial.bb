SUMMARY = "A tutorial on the use of Patgen 2"
DESCRIPTION = "This document describes the use of Patgen 2 to create \
hyphenation patterns for wide ranges of languages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn58841"

RPM_NAME = "texlive-patgen2-tutorial-2026.226.1.1svn58841-58.2.noarch.rpm"
RPM_HASH = "3e42d35e3d2ccb79a1082e5f030f4550945d6981ce8bff55670e1718c896630f226bc4a4c52d8b31d3a5eb592fe2988002e709e15845ccff84f28b09c955883d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-patgen2-tutorial"

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
