SUMMARY = "Bahasai language module for the datetime2 package"
DESCRIPTION = "This module provides the 'bahasai' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn46287"

RPM_NAME = "texlive-datetime2-bahasai-2026.226.1.01svn46287-61.2.noarch.rpm"
RPM_HASH = "7d1e3ce70104b14ac1fc48649edb711989a4fe827333c378098b73449bd344536f02e46841dd71142f872591827af09eb7e79fc07592a48c6610117b9f2b8414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-bahasai.ldf \
texlive-datetime2-bahasai"

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
