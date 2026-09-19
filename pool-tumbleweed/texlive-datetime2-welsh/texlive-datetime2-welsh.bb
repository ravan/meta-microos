SUMMARY = "Welsh language module for the datetime2 package"
DESCRIPTION = "This module provides the 'welsh' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52553"

RPM_NAME = "texlive-datetime2-welsh-2026.226.1.1svn52553-59.2.noarch.rpm"
RPM_HASH = "f6ecbb56b0899149651a631a44719a7c97c457f692962cb12a58b27c610b1c6af2073010f2a3a08ed4bee0ab849ee58912443c332f9db46f3c83182f3ce03321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-welsh-ascii.ldf \
tex-datetime2-welsh-utf8.ldf \
tex-datetime2-welsh.ldf \
texlive-datetime2-welsh"

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
