SUMMARY = "Lower Sorbian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'lsorbian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47749"

RPM_NAME = "texlive-datetime2-lsorbian-2026.226.1.1svn47749-59.2.noarch.rpm"
RPM_HASH = "ef17fb31a849dc7b88903a01905275afec7973b72da3469d55ebe7285aa36d730b080741acea512eef6ab6039debd6f1bb4e14f48fbae69c1bd3df75b61d74df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-lsorbian-ascii.ldf \
tex-datetime2-lsorbian-utf8.ldf \
tex-datetime2-lsorbian.ldf \
texlive-datetime2-lsorbian"

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
