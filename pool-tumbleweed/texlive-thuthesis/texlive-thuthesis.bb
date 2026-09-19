SUMMARY = "Thesis template for Tsinghua University"
DESCRIPTION = "This package establishes a simple and easy-to-use LaTeX \
template for Tsinghua dissertations, including general \
undergraduate research papers, masters theses, doctoral \
dissertations, and postdoctoral reports."
LICENSE = "LPPL-1.0"

PV = "2026.227.7.6.0svn74775"

RPM_NAME = "texlive-thuthesis-2026.227.7.6.0svn74775-62.2.noarch.rpm"
RPM_HASH = "a25a38448d39687f9d2f18f4c30578e29de88619c642d879437c16cf296c6bd8463269add64e487fe5d89a1ccd03ce797c2ca636265b898790af6e5d532c5e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thuthesis-author-year.bbx \
tex-thuthesis-author-year.cbx \
tex-thuthesis-bachelor.bbx \
tex-thuthesis-bachelor.cbx \
tex-thuthesis-inline.cbx \
tex-thuthesis-numeric.bbx \
tex-thuthesis-numeric.cbx \
tex-thuthesis.cls \
texlive-thuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-bibunits.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-filehook.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-gb7714-2015.bbx \
tex-gb7714-2015.cbx \
tex-gb7714-2015ay.bbx \
tex-gb7714-2015ay.cbx \
tex-geometry.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-notoccite.sty \
tex-pdfpages.sty \
tex-subcaption.sty \
tex-titletoc.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-url.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
