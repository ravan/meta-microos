SUMMARY = "Tabular column heads and multilined cells"
DESCRIPTION = "This package supports common layouts for tabular column heads \
in whole documents, based on one-column tabular environment. In \
addition, it can create multi-lined tabular cells. The Package \
also offers: a macro which changes the vertical space around \
all the cells in a tabular environment (similar to the function \
of the tabls package, but using the facilities of the array) \
macros for multirow cells, which use the facilities of the \
multirow package; macros to number rows in tables, or to skip \
cells; diagonally divided cells; horizontal lines in tabular \
environments with defined thickness."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1esvn78101"

RPM_NAME = "texlive-makecell-2026.226.0.0.1esvn78101-59.2.noarch.rpm"
RPM_HASH = "eee1a76c765c9fd07c7b1c5ecbd67501646e79988528cf4b9eab1a8f05c8639a89d205c2b630fa739999160b67a8385820c934d127bee9db7b777d9a1c5b8bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makecell.sty \
texlive-makecell"

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
