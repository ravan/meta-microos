SUMMARY = "Display short quotations"
DESCRIPTION = "The package determines (on the basis of the width of the text \
of the epigram, laid out on a single line) whether to produce a \
line or a displayed paragraph."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn20513"

RPM_NAME = "texlive-epigram-2026.226.svn20513-61.4.noarch.rpm"
RPM_HASH = "d09b3b8cb60232299cd90910f3492b4f4ebabc38cd97c6c8d7a5614f3ac210f1b88777e09ff9dbbcb246c67917abb196eefdb8e622199e28336eb9025e5b97a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epigram.tex \
texlive-epigram"

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
