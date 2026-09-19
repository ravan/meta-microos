SUMMARY = "Danish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'danish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47034"

RPM_NAME = "texlive-datetime2-danish-2026.226.1.1svn47034-59.2.noarch.rpm"
RPM_HASH = "65525ae0b0ffc322057019fded0b21cc21a9e3e008b7f7d276660806000266f9159468d370908955194f9c55296e8e5e9b8229ed38ed5740cc4ee11ed1ee3977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-danish-ascii.ldf \
tex-datetime2-danish-utf8.ldf \
tex-datetime2-danish.ldf \
texlive-datetime2-danish"

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
