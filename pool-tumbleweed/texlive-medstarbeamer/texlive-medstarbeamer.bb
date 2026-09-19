SUMMARY = "Beamer document class for MedStar Health Research Institute"
DESCRIPTION = "This is a beamer template for MedStar Health presentations. It \
includes sample presentations using both .tex files and .rnw \
files. The document class is obviously compatible with both. \
The advantage of the .rnw file is that it can be used with \
knitr such that you can weave your R code with your \
presentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn38828"

RPM_NAME = "texlive-medstarbeamer-2026.226.svn38828-59.2.noarch.rpm"
RPM_HASH = "13c0030e6a30cbb1a3c38dab4a0e199ec18d4180947226d2d53d1a85c55159fbd5759a877505cc121bd868d08189604ecad04be06d869da3e5cc29cfab9bff66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeMedStarColors.sty \
tex-medstarbeamer.cls \
texlive-medstarbeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-anysize.sty \
tex-background.sty \
tex-booktabs.sty \
tex-cancel.sty \
tex-enumerate.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-pgf.sty \
tex-soul.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
