SUMMARY = "Drawing chess boards and positions with MetaPost"
DESCRIPTION = "This package allows you to draw chess boards and positions. The \
appearance of the drawings is modern and largely inspired by \
what is offered by the excellent web site Lichess.org. Relying \
on MetaPost probably allows more graphic flexibility than the \
excellent LaTeX packages. This package is in beta version, do \
not hesitate to report bugs, as well as requests for \
improvement"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn78101"

RPM_NAME = "texlive-mpchess-2026.226.0.0.9svn78101-61.2.noarch.rpm"
RPM_HASH = "23cd471a84d9f8313d785bc33a46ec0361f1898d3efafd9896da1da27494b6b1ad73d7640b35f95d45a23b23ec130a018193859494307e9fea8fdfc92e81a5f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpchess"

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
texlive-mpchess-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
