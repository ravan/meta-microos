SUMMARY = "Radboud University Titlepage Package"
DESCRIPTION = "This is an unofficial LaTeX package to generate titlepages for \
the Radboud University, Nijmegen. It uses official vector logos \
from the university. This package requires the following other \
LaTeX packages: geometry, graphicx, ifpdf, keyval, iflang, and, \
optionally, babel-dutch."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn76924"

RPM_NAME = "texlive-rutitlepage-2026.226.3.0svn76924-60.2.noarch.rpm"
RPM_HASH = "ab5ff7a226f9c1d9b5c254898caeb2ff2699d4d3931084b485375612983796c3ec36adf890ac8887c776b975bd75db36a1b13c0261c6f31d76fe42ef28f02845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rutitlepage.sty \
texlive-rutitlepage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
tex-graphicx.sty \
tex-iflang.sty \
tex-ifpdf.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
