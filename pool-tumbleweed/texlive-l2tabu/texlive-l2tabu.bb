SUMMARY = "Obsolete packages and commands"
DESCRIPTION = "The 'sins' of LaTeX users, and how to correct them. The \
document provides a list of obsolete packages and commands. \
This original is in German; it has been translated into \
English, French, Italian, and Spanish."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn63708"

RPM_NAME = "texlive-l2tabu-2026.226.2.4svn63708-63.2.noarch.rpm"
RPM_HASH = "e44689b3cec7bf1328889e435ca097a5479446e0d78cdd08ed4838ae40afeaf1535f74850e63487a38692562fcd31d4c5c708ce164956ea99d2aae5c8a8cb4b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu"

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
