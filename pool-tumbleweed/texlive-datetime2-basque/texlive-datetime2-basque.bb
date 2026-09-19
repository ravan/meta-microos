SUMMARY = "Basque language module for the datetime2 package"
DESCRIPTION = "This module provides the 'basque' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn47064"

RPM_NAME = "texlive-datetime2-basque-2026.226.1.2asvn47064-59.2.noarch.rpm"
RPM_HASH = "3992fcc5c291993cb75bf1e5bae4be82f77936206cd04cdcc3ff5a4b223664ec6b5feb1520f8895c54db7ee6ab73447ac0872c0c11a6d350dc3da4f37522d835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-basque.ldf \
texlive-datetime2-basque"

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
