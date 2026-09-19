SUMMARY = "French language module for the datetime2 package"
DESCRIPTION = "This module provides the 'french' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn56393"

RPM_NAME = "texlive-datetime2-french-2026.226.1.03svn56393-59.2.noarch.rpm"
RPM_HASH = "3268e608e11c538651b56f3638cfe76d6522b0d069dc317cf287bf018cda14150fe0ed3ff5499b3bfaec38b756d5f89742c4bf74354869e745ec9e4aafc28308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-french-ascii.ldf \
tex-datetime2-french-utf8.ldf \
tex-datetime2-french.ldf \
texlive-datetime2-french"

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
