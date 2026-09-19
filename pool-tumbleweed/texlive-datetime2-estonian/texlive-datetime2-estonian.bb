SUMMARY = "Estonian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'estonian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47565"

RPM_NAME = "texlive-datetime2-estonian-2026.226.1.1svn47565-59.2.noarch.rpm"
RPM_HASH = "c758c2e579b3758a65b9cfa7489036d1f4c83e4928ab771b33f9cc027ed77289ba6b596f41b01760f491ed30abf66a89b71cc4f490409f8a6e4453882dacc382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-estonian-ascii.ldf \
tex-datetime2-estonian-utf8.ldf \
tex-datetime2-estonian.ldf \
texlive-datetime2-estonian"

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
