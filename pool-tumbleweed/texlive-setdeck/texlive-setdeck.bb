SUMMARY = "Typeset cards for Set"
DESCRIPTION = "The package will typeset cards for use in a game of Set."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1svn40613"

RPM_NAME = "texlive-setdeck-2026.226.0.0.1svn40613-60.2.noarch.rpm"
RPM_HASH = "d26b794be70fc7deb95312514024041bf3324bca551975ccb2d4de9a1fc13b7244d4aa8bca1f66fbab916a4b267dbaaed2d0efdd09e7bf046493c801ba52d947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-setdeck.sty \
texlive-setdeck"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
