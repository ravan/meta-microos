SUMMARY = "Tabular with variable width columns balanced"
DESCRIPTION = "The package defines a tabular*-like environment, tabulary, \
taking a 'total width' argument as well as the column \
specifications. The environment uses column types L, C, R and J \
for variable width columns (\\raggedright', \\centering, \
\\raggedleft, and normally justified). In contrast to tabularx's \
X columns, the width of each column is weighted according to \
the natural width of the widest cell in the column."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.11svn77682"

RPM_NAME = "texlive-tabulary-2026.227.0.0.11svn77682-62.2.noarch.rpm"
RPM_HASH = "4e8bae096823448a31857cfa44d4a10d088cede4d459d04916738accc3e9c197ed2cd5b19f688ee34f275b1be682c79fe8aef7dd29e395d1f5b51e62e231b3b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabulary-v010.sty \
tex-tabulary.sty \
texlive-tabulary"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
