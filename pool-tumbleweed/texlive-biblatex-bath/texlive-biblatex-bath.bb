SUMMARY = "Harvard referencing style as recommended by the University of Bath Library"
DESCRIPTION = "This package provides a BibTeX style to format reference lists \
in the Harvard style recommended by the University of Bath \
Library. It should be used in conjunction with natbib for \
citations."
LICENSE = "LPPL-1.0"

PV = "2026.226.7.2svn77530"

RPM_NAME = "texlive-biblatex-bath-2026.226.7.2svn77530-61.2.noarch.rpm"
RPM_HASH = "b924adb50a3d98b027138c4d3c8633a35085f83e37e5be9eccbc8173a50f3f1257f0f993f428ea9998d9e99729f376ccf55bfe475070000e4272b1ba363e2584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bath.bbx \
tex-bath.cbx \
tex-british-bath.lbx \
tex-english-bath.lbx \
texlive-biblatex-bath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.cbx \
tex-etoolbox.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
