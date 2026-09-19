SUMMARY = "Romanian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'romanian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn56394"

RPM_NAME = "texlive-datetime2-romanian-2026.226.1.02svn56394-59.2.noarch.rpm"
RPM_HASH = "a70184d27571721de5ba600de0246474a51359e32dada1be11337c4e48b1d88d86d2126c0e1edef71308f7868be5bad52f098f1c914fdc6693d7be297b8370f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-romanian-ascii.ldf \
tex-datetime2-romanian-utf8.ldf \
tex-datetime2-romanian.ldf \
texlive-datetime2-romanian"

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
