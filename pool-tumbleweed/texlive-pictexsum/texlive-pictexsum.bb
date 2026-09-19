SUMMARY = "A summary of PicTeX commands"
DESCRIPTION = "The document summarises the commands of PicTeX. While it is no \
substitute for the PicTeX manual itself (available from \
Personal TeX inc.), the document is a useful aide-memoire for \
those who have read the manual."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24965"

RPM_NAME = "texlive-pictexsum-2026.226.svn24965-58.2.noarch.rpm"
RPM_HASH = "4d7d2bc92b23987623d2b7992308242f0d88d5a8a248733accb435a006bdc986d18e71696eab1c5f0c94b8978fcf439a6aebae97ef09ece3d92ff70743cd2435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pictexsum"

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
