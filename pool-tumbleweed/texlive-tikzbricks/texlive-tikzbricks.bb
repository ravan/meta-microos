SUMMARY = "Drawing bricks with TikZ"
DESCRIPTION = "A small LaTeX package to draw bricks with TikZ. The user can \
modify color, shape, and viewpoint."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn73140"

RPM_NAME = "texlive-tikzbricks-2026.226.0.0.6svn73140-59.2.noarch.rpm"
RPM_HASH = "cb25512af984b5a81bd919ff4a4f13d3f7bcbc6b0ed5e0b4fecdf610db5da228fb8449a92f69505d0a16e9ba673e19ce2f211662bd40a24dda04093ea0c59b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzbricks.sty \
texlive-tikzbricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz-3dplot.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-epstopdf-pkg \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-tikz-3dplot"

inherit rpm
