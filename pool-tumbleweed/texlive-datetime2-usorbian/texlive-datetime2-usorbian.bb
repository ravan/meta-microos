SUMMARY = "Upper Sorbian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'usorbian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52375"

RPM_NAME = "texlive-datetime2-usorbian-2026.226.1.1svn52375-59.2.noarch.rpm"
RPM_HASH = "67b47d11475b65b1a62b273a746d7b14f36c611c1e9a77e656346f470b1765bbf5bf1a6dd858cb97da27849fc71fcd8897855b7490107b96063e74f1886e4b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-usorbian-ascii.ldf \
tex-datetime2-usorbian-utf8.ldf \
tex-datetime2-usorbian.ldf \
texlive-datetime2-usorbian"

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
