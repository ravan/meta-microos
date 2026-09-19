SUMMARY = "Croatian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'croatian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36682"

RPM_NAME = "texlive-datetime2-croatian-2026.226.1.0svn36682-59.2.noarch.rpm"
RPM_HASH = "4ea207907f191a41a21303b4dd65d4321554b35ad45a19173b111cef8b7e676d0f032e3ad10733e1eaf7757222d02fb1041262b94b42ae413409733df795d799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-croatian-ascii.ldf \
tex-datetime2-croatian-utf8.ldf \
tex-datetime2-croatian.ldf \
texlive-datetime2-croatian"

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
