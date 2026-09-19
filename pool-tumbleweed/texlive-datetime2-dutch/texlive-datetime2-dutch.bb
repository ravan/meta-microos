SUMMARY = "Dutch language module for the datetime2 package"
DESCRIPTION = "This module provides the 'dutch' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47355"

RPM_NAME = "texlive-datetime2-dutch-2026.226.1.1svn47355-59.2.noarch.rpm"
RPM_HASH = "64ec96405448e769a1648c1b4091e1166c7a0b08035f9580df13ab735695b28c46b5bff5f8b11d5b44714cf719e8e584eda0e757c6a3cb75356a00c325c8114b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-dutch.ldf \
texlive-datetime2-dutch"

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
