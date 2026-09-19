SUMMARY = "Slovene language module for the datetime2 package"
DESCRIPTION = "This module provides the 'slovene' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52282"

RPM_NAME = "texlive-datetime2-slovene-2026.226.1.1svn52282-59.2.noarch.rpm"
RPM_HASH = "525b8757e463f298c193e82f56fd26b6964923373888bc7262c80dd5e94c4acd6afe49304330ce8409aab69509c6b62df4d4ef9d31b8814e6e919f4ddeecf12e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-slovene-ascii.ldf \
tex-datetime2-slovene-utf8.ldf \
tex-datetime2-slovene.ldf \
texlive-datetime2-slovene"

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
