SUMMARY = "Portuguese language module for the datetime2 package"
DESCRIPTION = "This module provides the 'portuges' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48457"

RPM_NAME = "texlive-datetime2-portuges-2026.226.1.1svn48457-59.2.noarch.rpm"
RPM_HASH = "d1f6de00683655e28c9ad08c8f1181f8ea2ccebb439a6a56d2cfa55647d5af9f19784c523e67cc0b04a10d4c28d514627601263262ecef9b83c6a00953a27684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-portuges-ascii.ldf \
tex-datetime2-portuges-utf8.ldf \
tex-datetime2-portuges.ldf \
texlive-datetime2-portuges"

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
