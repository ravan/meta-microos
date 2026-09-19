SUMMARY = "The colour palette of The University of Western Australia"
DESCRIPTION = "This package uses the xcolor package to define macros for the \
colour palette of The University of Western Australia."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn60443"

RPM_NAME = "texlive-uwa-colours-2026.226.1.0.0svn60443-60.2.noarch.rpm"
RPM_HASH = "06952b0e4291d188dba26d3ac3f3ef7cde7e4fb8eda5c47cd4db6c4bae232dcca41619317bc381b2499caf5226cfcf8f257234e1a02ec7d0d2f3f8dd6fc04070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwa-colours.sty \
texlive-uwa-colours"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
