SUMMARY = "Draw syntactic trees, etc., for linguistics literature, using xy-pic"
DESCRIPTION = "The macros in this package model the construction of linguistic \
tree structures as a genuinely graphical problem: they contain \
two types of objects, BRANCHES and NODE LABELS, and these are \
positioned relative to a GRID. It is essential that each of \
these three elements is constructed independent of the other \
two, and hence they can be modified without unwanted side \
effects. The macros are based on the xy-pic package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-xyling-2026.226.1.1svn15878-59.4.noarch.rpm"
RPM_HASH = "876eada2227dcd691b80824ab4ca8b8e03b8bb2d38f70d4269019117bc328fc001a1d32e598a6c53af97b293d25a824e58cedcd4b8905d21cc0e3358a95ea1ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xyling.sty \
texlive-xyling"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifthen.sty \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
