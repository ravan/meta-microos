SUMMARY = "LaTeX Thesis Template for Chongqing University"
DESCRIPTION = "CQUThesis stands for Chongqing University Thesis Template for \
LaTeX, bearing the ability to support bachelor, master, doctor \
dissertations with grace and speed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.50svn55643"

RPM_NAME = "texlive-cquthesis-2026.226.1.50svn55643-61.2.noarch.rpm"
RPM_HASH = "817733ec723e2dbec8559738801be5e21626f3ed21a852b398059b0be96121575e2a712b3ee8e76d55890beb6a69558156ddc1d9e1e63891318125c1d4c721e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cquthesis.cfg \
tex-cquthesis.cls \
tex-cquthesis.sty \
texlive-cquthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-bicaption.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-changepage.sty \
tex-courier.sty \
tex-ctexbook.cls \
tex-diagbox.sty \
tex-dirtree.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-longtable.sty \
tex-metalogo.sty \
tex-mhchem.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-newfloat.sty \
tex-newtxtext.sty \
tex-ntheorem.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tabu.sty \
tex-tabularx.sty \
tex-tocloft.sty \
tex-totcount.sty \
tex-upgreek.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
