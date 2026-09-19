SUMMARY = "Improve the typesetting of matrices and tabulars with PGF"
DESCRIPTION = "This package is based on the package array. It creates PGF/TikZ \
nodes under the cells of the array and uses these nodes to \
provide functionalities to construct tabulars, arrays and \
matrices. Among the features : continuous dotted lines for the \
mathematical matrices; exterior rows and columns (so-called \
border matrices); control of the width of the columns; tools to \
color rows and columns with a good PDF result; blocks of cells; \
tabular notes; etc. The package requires and loads array, \
amsmath, pgfcore, and the module shapes of PGF."
LICENSE = "LPPL-1.0"

PV = "2026.226.7.7svn78219"

RPM_NAME = "texlive-nicematrix-2026.226.7.7svn78219-61.2.noarch.rpm"
RPM_HASH = "a3c5de65b7f816621779a4ba8a6c8e4646e5dcd7b9563220611e00b0b37e1aceab7681217ed380a3d9d4583e4f0d1160a2f434a1729219f0a9f7ee6ed3264f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nicematrix.sty \
texlive-nicematrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-footnote.sty \
tex-footnotehyper.sty \
tex-pgfcore.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
