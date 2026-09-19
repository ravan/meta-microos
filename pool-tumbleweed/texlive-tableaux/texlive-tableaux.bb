SUMMARY = "Construct tables of signs and variations"
DESCRIPTION = "The package uses PSTricks; the user may define the width of the \
table, the number of lines and the height of each line. \
Placement of labels within the boxes may be absolute, or as a \
percentage of the width; various other controls are available."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42413"

RPM_NAME = "texlive-tableaux-2026.226.svn42413-64.2.noarch.rpm"
RPM_HASH = "adff4c3b587eab34bfbbe0fe34b836518ca4a26e38ea94455afa72a872fd03dbde2fe5316c16562ade3d1402406f6bdd5cc6e49048d10527d4bc0c3ccc621af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minimum.sty \
tex-tableau.sty \
texlive-tableaux"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-babel.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hhline.sty \
tex-inputenc.sty \
tex-pst-fill.sty \
tex-pst-plot.sty \
tex-pst-tree.sty \
tex-pstcol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
