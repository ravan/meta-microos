SUMMARY = "Esperanto language module for the datetime2 package"
DESCRIPTION = "This module provides the 'esperanto' style that can be set \
using \\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47356"

RPM_NAME = "texlive-datetime2-esperanto-2026.226.1.1svn47356-59.2.noarch.rpm"
RPM_HASH = "5038c0df07589ab5167d522142a1e16cbd71d4e29f774236efa359f9aa6a0d9ac8f3c6a9d59039e1a51c19557c499ece91ae083c493ed054fe421b1adad4ab7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-esperanto-ascii.ldf \
tex-datetime2-esperanto-utf8.ldf \
tex-datetime2-esperanto.ldf \
texlive-datetime2-esperanto"

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
