SUMMARY = "Ukrainian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'ukrainian' style that can be set \
using \\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn47552"

RPM_NAME = "texlive-datetime2-ukrainian-2026.226.1.2asvn47552-59.2.noarch.rpm"
RPM_HASH = "55095ac41de5fe9114983583e7e656ec14e664af3863d21484325fc53f13c5bd982f1a144a829aecdfa1fe69a4050090af3baea117b0fe9ede6111d9c8086d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-ukrainian-ascii.ldf \
tex-datetime2-ukrainian-utf8.ldf \
tex-datetime2-ukrainian.ldf \
texlive-datetime2-ukrainian"

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
