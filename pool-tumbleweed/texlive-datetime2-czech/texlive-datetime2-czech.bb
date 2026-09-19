SUMMARY = "Czech language module for the datetime2 package"
DESCRIPTION = "This module provides the 'czech' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47033"

RPM_NAME = "texlive-datetime2-czech-2026.226.1.1svn47033-59.2.noarch.rpm"
RPM_HASH = "9108bbbc220c070d233f5b2ed59abc7315b82ce669171663831d100a98a1a26bf66a2917a418de2cdd96bd65a5d80ac1843f48b433bf1c5f609c0ab55d54cc74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-czech-ascii.ldf \
tex-datetime2-czech-utf8.ldf \
tex-datetime2-czech.ldf \
texlive-datetime2-czech"

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
