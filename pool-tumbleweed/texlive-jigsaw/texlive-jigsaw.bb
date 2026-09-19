SUMMARY = "Draw jigsaw pieces with TikZ"
DESCRIPTION = "This is a small LaTeX package to draw jigsaw pieces with TikZ. \
It is possible to draw individual pieces and adjust their \
shape, create tile patterns or automatically generate complete \
jigsaws."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn71923"

RPM_NAME = "texlive-jigsaw-2026.226.0.0.5svn71923-63.2.noarch.rpm"
RPM_HASH = "7d44942e22f2d5728ac57d961f086da4c8cd7494bc193acfe4c741f84a1018a9288bcc5a522de9358a5275be4b8e01f72d21a6a77d63203a01b27bdbac1de12a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jigsaw.sty \
texlive-jigsaw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-tikz.sty \
texlive \
texlive-epstopdf-pkg \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
