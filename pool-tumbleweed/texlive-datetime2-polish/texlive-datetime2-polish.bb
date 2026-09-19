SUMMARY = "Polish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'polish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48456"

RPM_NAME = "texlive-datetime2-polish-2026.226.1.1svn48456-59.2.noarch.rpm"
RPM_HASH = "a89f7c72b98f512d5775c9abb12735ca0156d4a3506f051620f65e5f0911bbe708f65bde3b910ac36c325b8a258a1f69e5563470dcd0ec6de629eb8bb230800f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-polish-ascii.ldf \
tex-datetime2-polish-utf8.ldf \
tex-datetime2-polish.ldf \
texlive-datetime2-polish"

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
