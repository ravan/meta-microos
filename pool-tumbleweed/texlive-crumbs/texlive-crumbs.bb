SUMMARY = "Add a Navigation Path to the page header"
DESCRIPTION = "This package adds a navigation path ('breadcrumb trail') at the \
header of a presentation, just like some websites do in order \
to simplify navigation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn64602"

RPM_NAME = "texlive-crumbs-2026.226.0.0.4.1svn64602-61.2.noarch.rpm"
RPM_HASH = "54fe163a43c2aa7a2bd0e21e53cd2dd48fc922a0d7d180d64c8f7b42ef02d304c50251d829c5fa42b2acbbc0bba56a0ac504e705a74cbe280d4b7787f802496d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crumbs.sty \
texlive-crumbs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-etoolbox.sty \
tex-xkeyval.sty \
texlive \
texlive-catchfile \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xkeyval"

inherit rpm
