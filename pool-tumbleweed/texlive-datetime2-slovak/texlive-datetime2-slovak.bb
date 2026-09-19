SUMMARY = "Slovak language module for the datetime2 package"
DESCRIPTION = "This module provides the 'slovak' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52281"

RPM_NAME = "texlive-datetime2-slovak-2026.226.1.1svn52281-59.2.noarch.rpm"
RPM_HASH = "4ee0849255e2905336aa5dd7ea601591bfda6644951e0234371d9dbe36903682ab4dd08566233205b67f71f3f06439ff234477e5f3f722199a0aaf39da8a9f11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-slovak-ascii.ldf \
tex-datetime2-slovak-utf8.ldf \
tex-datetime2-slovak.ldf \
texlive-datetime2-slovak"

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
