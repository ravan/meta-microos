SUMMARY = "Bulgarian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'bulgarian' style that can be set \
using \\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47031"

RPM_NAME = "texlive-datetime2-bulgarian-2026.226.1.1svn47031-59.2.noarch.rpm"
RPM_HASH = "0d9d4483c2c432c7c94290d6988685d2191c47a3a2a8f4fb5ce73a10c4560ef873954ecfc06b65b3fd8054ec9fe378f00983a057b4ccd82c3ac269f431c70376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-bulgarian-ascii.ldf \
tex-datetime2-bulgarian-utf8.ldf \
tex-datetime2-bulgarian.ldf \
texlive-datetime2-bulgarian"

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
