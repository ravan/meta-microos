SUMMARY = "Draw sun path charts"
DESCRIPTION = "This package can help to draw sun path charts using a polar \
coordinate system."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn72604"

RPM_NAME = "texlive-sunpath-2026.226.0.0.5svn72604-64.2.noarch.rpm"
RPM_HASH = "7e3e67a578422e68f2a72d669d947e0236c7f7f3f9fc8428881b8ea91f5bd9d1ee41621f06885de82bbeb3385d6e0fd3c2b56413abc415032826c8dfab1a4ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sunpath.sty \
texlive-sunpath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
