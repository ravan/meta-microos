SUMMARY = "Hebrew language module for the datetime2 package"
DESCRIPTION = "This module provides the 'hebrew' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47534"

RPM_NAME = "texlive-datetime2-hebrew-2026.226.1.1svn47534-59.2.noarch.rpm"
RPM_HASH = "86fd630720b4c255e3940d74fd1e29841c0896f20f3d415a2184d9d79cdd81b9a6cdfa1dee414245992443114a4a3289bf9238793bfb3aa42ada345d2fac4aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-hebrew.ldf \
texlive-datetime2-hebrew"

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
