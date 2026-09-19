SUMMARY = "A dissertation class"
DESCRIPTION = "The class was developed to typeset a dissertation at ETH \
Zurich. The requirements were to use A5 paper and 10pt type. A \
sample of the output is shown in the PDF documentation link."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "13128f1682eac141a2644d8f209e498ad443c423a1de3dba8852dfd83feee3327ee08bc731f2ef0a2bb8c0d85ee6d1cd3a75c55151c93c649c035688330d6006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hpsdiss.cls \
texlive-hpsdiss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-calc.sty \
tex-colordvi.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-mparhack.sty \
tex-ragged2e.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
