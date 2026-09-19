SUMMARY = "Northern Sami language module for the datetime2 package"
DESCRIPTION = "This module provides the 'samin' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn49346"

RPM_NAME = "texlive-datetime2-samin-2026.226.1.1svn49346-59.2.noarch.rpm"
RPM_HASH = "3a3b410c58f9976f8e960292a529cd74f540cc11430d7dfc6c5ab92928c3257afc18b9b1eb98bb8d42a2af3dfca58c82f65fc600f053d6aa17ec4bae7170c4f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-samin-ascii.ldf \
tex-datetime2-samin-utf8.ldf \
tex-datetime2-samin.ldf \
texlive-datetime2-samin"

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
