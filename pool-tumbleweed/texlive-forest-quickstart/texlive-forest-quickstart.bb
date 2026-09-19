SUMMARY = "Quickstart Guide for Linguists package 'forest'"
DESCRIPTION = "forest is a PGF/TikZ-based package for drawing linguistic (and \
other kinds of) trees. This manual provides a quickstart guide \
for linguists with just the essential things that you need to \
get started."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.svn55688"

RPM_NAME = "texlive-forest-quickstart-2026.226.svn55688-60.2.noarch.rpm"
RPM_HASH = "bd05ba67067fdf81b63430e39470866db1a1b275ff025bfdd1023085827ed4c2b685c973ff214aaccf102845295894cc5ae6e9d345c67bc07f9caac1604ebf50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forest-quickstart"

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
