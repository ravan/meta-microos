SUMMARY = "Save the optional argument of \\item"
DESCRIPTION = "The package modifies \\item commands to save the optional \
argument in a box."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn22136"

RPM_NAME = "texlive-sitem-2026.226.1.0svn22136-64.2.noarch.rpm"
RPM_HASH = "e486df781b3ddb668de0f7395d516923d934ac9804568fee0758931a187ea8478b32479641ae92ede70065c9d389d35e27366fb08e91bed83faacfa1f7a7e01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sitem.sty \
texlive-sitem"

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
