SUMMARY = "Class for EJP and ECP"
DESCRIPTION = "The class is designed for typesetting articles for the \
mathematical research periodicals Electronic Journal of \
Probability (EJP) and Electronic Communications in Probability \
(ECP). It depends on amsmath, amsfonts, amsthm, bera, dsfont, \
geometry, graphicx, hyperref, lastpage, latexsym, mathtools, \
microtype, and afterpackage."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-2026.226.1.11.3svn60950-61.4.noarch.rpm"
RPM_HASH = "1556c97c31e5b8c724c22389647342aa2e305865a37b7368069b5b9fefd2e88900ef45cbd3d7b3f7787605ec526ee7dcfd1c97960f9733b683d2718e491206c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ejpecp.cls \
texlive-ejpecp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpackage.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-auto-pst-pdf.sty \
tex-bera.sty \
tex-dsfont.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-latexsym.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
