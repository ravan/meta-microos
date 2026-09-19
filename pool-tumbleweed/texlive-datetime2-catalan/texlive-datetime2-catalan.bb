SUMMARY = "Catalan language module for the datetime2 package"
DESCRIPTION = "This module provides the 'catalan' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47032"

RPM_NAME = "texlive-datetime2-catalan-2026.226.1.1svn47032-59.2.noarch.rpm"
RPM_HASH = "dd8b7f83e9b6f1eab7a5d49834a0f2af71f46586924ff0d5eecd19acf625d94bd3553ec5ff4847eb9eda4be5b20b0cc1458d5a2e1ac09ba4ae0bc01dea4e91f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-catalan-ascii.ldf \
tex-datetime2-catalan-utf8.ldf \
tex-datetime2-catalan.ldf \
texlive-datetime2-catalan"

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
