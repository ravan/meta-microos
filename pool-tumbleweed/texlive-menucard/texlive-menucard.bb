SUMMARY = "Typesetting menu cards with LaTeX"
DESCRIPTION = "This LaTeX package can be used for typesetting simple \
restaurant menus."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn55643"

RPM_NAME = "texlive-menucard-2026.226.0.0.1svn55643-61.2.noarch.rpm"
RPM_HASH = "88c6c14b0fae748af79ea8a1aa6725ba14c7216e6e04ae917fe81ff170628108e93d405395c52bb2709438cae290879ae3d2d08cc91c4c7124c9548e38a5a471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-menucard.sty \
texlive-menucard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
