SUMMARY = "Scottish Gaelic Language Module for the datetime2 Package"
DESCRIPTION = "This module provides the 'scottish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52101"

RPM_NAME = "texlive-datetime2-scottish-2026.226.1.1svn52101-59.2.noarch.rpm"
RPM_HASH = "63c4ea268c9987ab79d247cb67af2fc5d5e6f0a99ee10af162bb9773cddc9c9731fba5dd94e644fd4c3ed701992ec6dc6305c55f15a834353a1b92a72811e3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-scottish-ascii.ldf \
tex-datetime2-scottish-utf8.ldf \
tex-datetime2-scottish.ldf \
texlive-datetime2-scottish"

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
