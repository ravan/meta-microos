SUMMARY = "Galician language module for the datetime2 package"
DESCRIPTION = "This module provides the 'galician' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47631"

RPM_NAME = "texlive-datetime2-galician-2026.226.1.0svn47631-59.2.noarch.rpm"
RPM_HASH = "1fbd03ecec517cac352a23ae65f2bb66e5a6f59660eef31126c183dd7bc3348930ae5c831f26261eca84cd3de62a2007886a5b6996ffb30032d236c49b8c7717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-galician-ascii.ldf \
tex-datetime2-galician-utf8.ldf \
tex-datetime2-galician.ldf \
texlive-datetime2-galician"

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
