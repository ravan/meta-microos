SUMMARY = "Create tiles of a graphical file"
DESCRIPTION = "This package breaks a given graphical file into n rows and m \
columns of subgraphics, which are called tiles. The tiles can \
be written separately to individual PDF files, or packaged into \
a single PDF file."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55325"

RPM_NAME = "texlive-tile-graphic-2026.226.svn55325-59.2.noarch.rpm"
RPM_HASH = "63bfe46e24e1825449ae539cad792d3296312685b4a3d8a97caebb4d5deda64f6f3320e13852dac348004421050732f78735bc9ebf116921e58f85a3c590fe22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tile-graphic.sty \
texlive-tile-graphic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-multido.sty \
tex-shellesc.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
