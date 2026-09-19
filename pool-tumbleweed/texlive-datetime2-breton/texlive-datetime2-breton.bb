SUMMARY = "Breton language module for the datetime2 package"
DESCRIPTION = "This module provides the 'breton' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn52647"

RPM_NAME = "texlive-datetime2-breton-2026.226.1.2svn52647-59.2.noarch.rpm"
RPM_HASH = "d1361f22f34c6b0585f53d0b3a39501539040c085559170a83a52e0baf9d526f00ae79a2b1879d3cd8a97400a2c7ca14bd6c1537fd36b34fc28d5190f4b67805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-breton-ascii.ldf \
tex-datetime2-breton-utf8.ldf \
tex-datetime2-breton.ldf \
texlive-datetime2-breton"

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
