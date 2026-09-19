SUMMARY = "Latin language module for the datetime2 package"
DESCRIPTION = "This module provides the 'latin' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47748"

RPM_NAME = "texlive-datetime2-latin-2026.226.1.0svn47748-59.2.noarch.rpm"
RPM_HASH = "ad35b4bfe49da0765bfb85540b467a0c491ab2b6da126e1d102c8ab632c50d784f6383217b78b6874abcebc499578b71e6b7216b2042cf880d61146e6307dfea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-latin.ldf \
texlive-datetime2-latin"

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
