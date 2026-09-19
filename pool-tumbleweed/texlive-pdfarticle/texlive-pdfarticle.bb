SUMMARY = "Class for pdf publications"
DESCRIPTION = "pdfArticle is simple document class dedicated for creating pdf \
documents with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51127"

RPM_NAME = "texlive-pdfarticle-2026.226.1.0svn51127-58.2.noarch.rpm"
RPM_HASH = "6efcc20b9accc5430ffc084e736e595f781295613ff1d8e4809399727732271c43d4c1b01c74b6512efbad266564f6800dd60be48679aab84e2d0aafdff635c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfArticle.cls \
texlive-pdfarticle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-alphalph.sty \
tex-amsmath.sty \
tex-array.sty \
tex-changepage.sty \
tex-contour.sty \
tex-dcolumn.sty \
tex-enumitem.sty \
tex-extarticle.cls \
tex-fancyvrb.sty \
tex-fifo-stack.sty \
tex-fontspec.sty \
tex-fvextra.sty \
tex-geometry.sty \
tex-graphbox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-minted.sty \
tex-overpic.sty \
tex-pbox.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-shadowtext.sty \
tex-tabto.sty \
tex-tcolorbox.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-varwidth.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
