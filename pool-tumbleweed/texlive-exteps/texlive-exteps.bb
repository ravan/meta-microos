SUMMARY = "Include EPS figures in MetaPost"
DESCRIPTION = "Exteps is a module for including external EPS figures into \
MetaPost figures. It is written entirely in MetaPost, and does \
not therefore require any post processing of the MetaPost \
output."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.41svn19859"

RPM_NAME = "texlive-exteps-2026.226.0.0.41svn19859-59.2.noarch.rpm"
RPM_HASH = "1bdeb3bd6ff3f98510b1a58db2ff9c47bfde8b25b8cb327ec1d09fac69d820c2e19e519bb7df96540b3aaf032d7b32ff13c893976509c5ea92d67a150836df85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exteps"

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
