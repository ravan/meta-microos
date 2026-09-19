SUMMARY = "English translation of 'Obsolete packages and commands'"
DESCRIPTION = "English translation of the l2tabu practical guide to LaTeX2e by \
Mark Trettin. A list of obsolete packages and commands."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.8.5.7svn15878"

RPM_NAME = "texlive-l2tabu-english-2026.226.1.8.5.7svn15878-63.2.noarch.rpm"
RPM_HASH = "af8882679b27d3b997fe21387eada6d019de90c257e4d464a84c470f155fae2ed168219adbcb49d1a9b93e827923d63fec33f51a2662d0878f9a526b45c95915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-english"

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
