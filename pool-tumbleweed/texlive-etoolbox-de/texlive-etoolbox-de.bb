SUMMARY = "German translation of documentation of etoolbox"
DESCRIPTION = "The version translated is 2.1 or 2011-01-03."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn21906"

RPM_NAME = "texlive-etoolbox-de-2026.226.1svn21906-59.2.noarch.rpm"
RPM_HASH = "5563bc2b0eeddd3b3cc611c3c819568136a3cc0a4e2d8103d6ca82324d89837fbed82a796e04821e5a3caa81fea6446091a3f38d0c97ec0aee6fcb0dcf9f63be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoolbox-de"

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
