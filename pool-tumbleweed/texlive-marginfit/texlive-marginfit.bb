SUMMARY = "Improved margin notes"
DESCRIPTION = "This package fixes various bugs with the margin paragraph \
implementation of LaTeX. Those bugs include margin notes that \
are attached to the wrong side as well as those that stick out \
of the bottom of the page. This package provides a drop-in \
replacement solution."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-marginfit-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "06329783839e331324d45319c4161e75053681a9e65439e54e42d3624a8c0964a36eeff2aaa0b6423c8519cbe0329155d661e7e5a3a6c6163c523bc02f71123b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marginfit.sty \
texlive-marginfit"

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
