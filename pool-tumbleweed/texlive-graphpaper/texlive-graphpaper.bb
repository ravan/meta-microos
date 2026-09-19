SUMMARY = "A LaTeX class to generate several types of graph papers"
DESCRIPTION = "Graphpaper is a LaTeX document class which allows to print \
several types of graph papers: bilinear (millimeter paper), \
semilogarithmic, bilogarithmic, polar, log-polar, Smith charts. \
It is based on the picture environment and its extensions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn63116"

RPM_NAME = "texlive-graphpaper-2026.226.1.1svn63116-60.4.noarch.rpm"
RPM_HASH = "4f4f3508616517c310f1cdab0cc9252c4436651129da069ce8492256cafbde01816eee6b35a79dc456e156efedfc23388b24d866c65b98454da3207bbf891863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphpaper.cls \
texlive-graphpaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-euclideangeometry.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
