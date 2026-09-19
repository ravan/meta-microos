SUMMARY = "Miscellaneous LaTeX packages, etcetera"
DESCRIPTION = "The ltxmisc package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75878"

RPM_NAME = "texlive-ltxmisc-2026.226.svn75878-59.2.noarch.rpm"
RPM_HASH = "5373e18ee94c53a50bd9257dfac25eafdcbd3ca8cbdd87254eebe6ea62484ae482521c516be3ed0663b687312c6116f2c5b89f18d35169b06397feaf9c5a27af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abstbook.cls \
tex-beletter.cls \
tex-bibcheck.sty \
tex-concrete.sty \
tex-flashcard.cls \
tex-iagproc.cls \
tex-linsys.sty \
tex-mitpress.sty \
tex-thrmappendix.sty \
tex-topcapt.sty \
tex-vrbexin.sty \
texlive-ltxmisc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-beton.sty \
tex-calc.sty \
tex-euler.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-letter.cls \
tex-makeidx.sty \
tex-minitoc.sty \
tex-natbib.sty \
tex-pifont.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
