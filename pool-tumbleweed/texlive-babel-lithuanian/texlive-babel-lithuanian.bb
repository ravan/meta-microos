SUMMARY = "Babel support for documents written in Lithuanian"
DESCRIPTION = "Babel support material for documents written in Lithuanian \
moved from the lithuanian package into a new package \
babel-lithuanian to match babel support for other languages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn66513"

RPM_NAME = "texlive-babel-lithuanian-2026.226.1.0svn66513-60.2.noarch.rpm"
RPM_HASH = "79db8dbaad62a0ef1ceee9e767c3477a0d97acbfe994d684c230dbc8573ccee8a4251c3f4c95129a98895a84227406568ce486235f1fdef3f84fa4fd0d0f4f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lithuanian.ldf \
texlive-babel-lithuanian"

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
