SUMMARY = "Irish Gaelic Language Module for the datetime2 Package"
DESCRIPTION = "This module provides the 'irish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47632"

RPM_NAME = "texlive-datetime2-irish-2026.226.1.1svn47632-59.2.noarch.rpm"
RPM_HASH = "1d57046ff5a7fb504933812a72f244e4b340ad5b4bd8ec2619ac2272ae45613b089d9736e3e1fb22c7b012e4e2e523c18f7c29c891cb2932c08893d5db21f9f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-ga-GB.ldf \
tex-datetime2-ga-IE.ldf \
tex-datetime2-irish-ascii.ldf \
tex-datetime2-irish-utf8.ldf \
tex-datetime2-irish.ldf \
texlive-datetime2-irish"

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
