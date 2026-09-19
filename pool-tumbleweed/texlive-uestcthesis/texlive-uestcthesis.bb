SUMMARY = "Thesis class for UESTC"
DESCRIPTION = "The class is for typesetting a thesis at the University of \
Electronic Science and Technology of China."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn36371"

RPM_NAME = "texlive-uestcthesis-2026.226.1.1.0svn36371-60.2.noarch.rpm"
RPM_HASH = "2369a6932c265221bf04c07aacd7972f71c318af72333343e5fe6cc15cda0b18dba55a2f34438fb836cb36871f51ad945fbe92c98948c3bf183011e551847ec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uestcthesis.cls \
texlive-uestcthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-cmap.sty \
tex-color.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-flafter.sty \
tex-float.sty \
tex-footmisc.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-hyperxmp.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-marvosym.sty \
tex-mathptmx.sty \
tex-multibib.sty \
tex-natbib.sty \
tex-ntheorem.sty \
tex-pifont.sty \
tex-placeins.sty \
tex-subfigure.sty \
tex-tabularx.sty \
tex-texnames.sty \
tex-threeparttable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
