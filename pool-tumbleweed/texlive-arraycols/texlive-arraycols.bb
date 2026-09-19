SUMMARY = "New column types for array and tabular environments"
DESCRIPTION = "This small package provides new column types for array and \
tabular environments, horizontally and vertically centered, or \
with adjusted height for big mathematical expressions. The \
columns width can be fixed or calculated like in tabularx \
environments. Macros for drawing vertical and horizontal rules \
of variable thickness are also provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn71168"

RPM_NAME = "texlive-arraycols-2026.226.1.5svn71168-60.2.noarch.rpm"
RPM_HASH = "1431a094e9d3106762c5d25c0f46b9bc5e6417a4a9e731218add223ed7af9aada2ade62cc19b1ca95908a7bdd1ee868c849c8437255a3b5e53833a01c94943f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arraycols.sty \
texlive-arraycols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-cellspace.sty \
tex-makecell.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
