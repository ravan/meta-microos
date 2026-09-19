SUMMARY = "Write labels for plants"
DESCRIPTION = "The package defines a command \\plant, which has three mandatory \
and seven optional argument. The package uses the labels"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn29803"

RPM_NAME = "texlive-plantslabels-2026.226.1.0svn29803-58.2.noarch.rpm"
RPM_HASH = "b000f28cd942e2c8d18469cc5aee3cdfacac4e24d55c2fe4ef87c8fcbb2d222a8bb6e95b13d1fae8a1f0e0dd6f54164f1141cf9f738b04d9537d24cccf218cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plantslabels.sty \
texlive-plantslabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-labels.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
