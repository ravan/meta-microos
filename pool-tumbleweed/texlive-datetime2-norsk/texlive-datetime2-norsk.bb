SUMMARY = "Norsk language module for the datetime2 package"
DESCRIPTION = "This module provides the 'norsk' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48267"

RPM_NAME = "texlive-datetime2-norsk-2026.226.1.1svn48267-59.2.noarch.rpm"
RPM_HASH = "9e9a4d648abe18b4381c28b53ba6a1869f184c83ec22a4634670a936ac633b6438c08952d83ab22913864888194a5b8eba4ab115c59174aa9ceb176946091d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-norsk-ascii.ldf \
tex-datetime2-norsk-utf8.ldf \
tex-datetime2-norsk.ldf \
texlive-datetime2-norsk"

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
