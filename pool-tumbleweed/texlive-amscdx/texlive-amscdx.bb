SUMMARY = "Enhanced commutative diagrams"
DESCRIPTION = "The original amscd package provides a CD environment that \
emulates the commutative diagram capabilities of AMS-TeX \
version 2.x. This means that only simple rectangular diagrams \
are supported, with no diagonal arrows or more exotic features. \
This enhancement package implements double ('fat'), dashed, and \
bidirectional arrows (left-right and up-down), and color \
attributes for arrows and their annotations. The restriction to \
rectangular geometry remains. This nevertheless allows the \
drawing of a much broader class of 'commutative-diagram-like' \
diagrams. This update, 2.2x of 2019-07-02, fixes the \
dashed-arrows parts placement bug, and adds the package option \
'lyx', for use with lyx to prevent conflict with the already \
loaded amscd. The packages xcolor and graphicx are made \
required."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2xsvn77682"

RPM_NAME = "texlive-amscdx-2026.226.2.2xsvn77682-61.2.noarch.rpm"
RPM_HASH = "c0bdb5790c95aaed045652c1f0e2064863052b00d9ad0de73286029d96d1ebf4c06803567c616f72a957ff1fa98b69bd63e76fa1baa88227bd50677f4673ae5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amscdx.sty \
texlive-amscdx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsgen.sty \
tex-graphicx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
