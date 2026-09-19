SUMMARY = "A CTeX-based template for writing the main body of NSFC proposals"
DESCRIPTION = "This package provides a CTeX-based template for writing the \
main text of National Natural Science Foundation of China \
(NSFC) proposals. The package defines styles of the outlines \
and uses BibLaTeX/biber for the management of references."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn77520"

RPM_NAME = "texlive-mynsfc-2026.226.2.00svn77520-61.2.noarch.rpm"
RPM_HASH = "993690e38d8d0409d9827eacb27e2b5ac7488ffe9f5453a3b197c6ca864bc68406e949c565f55fed6319d435b464b7e528494e9a48ada7d0dcac1614a26ea2b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mynsfc.cls \
tex-mynsfc.def \
texlive-mynsfc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-caption.sty \
tex-ctexart.cls \
tex-etoolbox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-subcaption.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
