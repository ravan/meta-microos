SUMMARY = "Italian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'italian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn37146"

RPM_NAME = "texlive-datetime2-italian-2026.226.1.3svn37146-59.2.noarch.rpm"
RPM_HASH = "e2f8d792a453ba008fd79cbc204ad1abde04d021038631f89a07ac5357d860968860034b3902e4f0da0036e5c18a384181acaa2fe22405d091754db82e638356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-italian-ascii.ldf \
tex-datetime2-italian-utf8.ldf \
tex-datetime2-italian.ldf \
texlive-datetime2-italian"

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
