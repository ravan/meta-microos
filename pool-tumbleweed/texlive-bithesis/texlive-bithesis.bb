SUMMARY = "Templates for the Beijing Institute of Technology"
DESCRIPTION = "This package establishes a simple and easy-to-use LaTeX \
template for Beijing Institute of Technology dissertations, \
including general undergraduate theses and master theses."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.8.7svn77337"

RPM_NAME = "texlive-bithesis-2026.226.3.8.7svn77337-59.2.noarch.rpm"
RPM_HASH = "cc34d9573ca8b3aca4bdbb53d1fdaaa772253fabaed21193c31a462f58375436e3b3cec3d5364e43a931902dcc45b63e255e274d17d302b091a06d55d4eb4972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bitbeamer.cls \
tex-bithesis.cls \
tex-bitreport.cls \
texlive-bithesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-ctexart.cls \
tex-ctexbeamer.cls \
tex-ctexbook.cls \
tex-datetime2.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-fmtcount.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifplatform.sty \
tex-indentfirst.sty \
tex-l3keys2e.sty \
tex-listings.sty \
tex-multirow.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-titletoc.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xeCJKfntef.sty \
tex-zhlineskip.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
