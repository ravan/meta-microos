SUMMARY = "Turkish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'turkish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52331"

RPM_NAME = "texlive-datetime2-turkish-2026.226.1.1svn52331-59.2.noarch.rpm"
RPM_HASH = "457418ba1b92960ddcc57d71807803509a23c41b02c784c1df67ae2714177a77a643982d2976fc71b264576e8cacc90a8ed8a7cae4378356f97c2bea0bc17b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-turkish-ascii.ldf \
tex-datetime2-turkish-utf8.ldf \
tex-datetime2-turkish.ldf \
texlive-datetime2-turkish"

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
