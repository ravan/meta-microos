SUMMARY = "Swedish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'swedish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36700"

RPM_NAME = "texlive-datetime2-swedish-2026.226.1.0svn36700-59.2.noarch.rpm"
RPM_HASH = "59af1923523ade92f530b13292ee45c00d510c08d27a56305e7dc71c7ac5594db6a7f94a101950bda3ee79f333208fd971e2d4fffc3ee8acd274dac744e3828a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-swedish-ascii.ldf \
tex-datetime2-swedish-utf8.ldf \
tex-datetime2-swedish.ldf \
texlive-datetime2-swedish"

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
