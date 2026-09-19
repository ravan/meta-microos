SUMMARY = "Concert programmes"
DESCRIPTION = "A class which provides the necessary macros to prepare a \
(classical) concert programme; a sample is provided."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn18791"

RPM_NAME = "texlive-concprog-2026.226.svn18791-60.2.noarch.rpm"
RPM_HASH = "cbab3a5e74cb1945b9b5bcbff92427dbd90c3044880de971aad717ca322caa46aa5687ca6b466b084a8dda4efb77ba7b37307babaceee03054a4db42889879b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ConcProg.cls \
texlive-concprog"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
