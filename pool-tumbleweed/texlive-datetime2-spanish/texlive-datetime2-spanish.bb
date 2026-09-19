SUMMARY = "Spanish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'spanish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn45785"

RPM_NAME = "texlive-datetime2-spanish-2026.226.1.1svn45785-59.2.noarch.rpm"
RPM_HASH = "10288b32519dfe96e550fa2e31e77c7159d99208d1535f9ac987781630922bf32531bf26603134fb76300d18029c15818f4f60778f0e54355e2c9f5050e26c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-spanish-ascii.ldf \
tex-datetime2-spanish-utf8.ldf \
tex-datetime2-spanish.ldf \
texlive-datetime2-spanish"

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
