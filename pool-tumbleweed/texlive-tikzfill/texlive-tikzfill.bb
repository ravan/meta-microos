SUMMARY = "TikZ libraries for filling with images and patterns"
DESCRIPTION = "This is a collection of TikZ libraries which add further \
options to fill TikZ paths with images and patterns. The \
libraries comprise fillings with images from files and from \
TikZ pictures. Also, patterns of hexagons and of rhombi are \
provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-tikzfill-2026.226.1.0.1svn76924-59.2.noarch.rpm"
RPM_HASH = "ab37ea4c7178107866883cc29c412fdb58004391f92ce376449ae9fec595cfe9e6a123441e6e4adae2ca540d3b24180910c403a21a8a6087395f09a5dc354023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzfill-common.sty \
tex-tikzfill.hexagon.sty \
tex-tikzfill.image.sty \
tex-tikzfill.rhombus.sty \
tex-tikzfill.sty \
tex-tikzlibraryfill.hexagon.code.tex \
tex-tikzlibraryfill.image.code.tex \
tex-tikzlibraryfill.rhombus.code.tex \
texlive-tikzfill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
