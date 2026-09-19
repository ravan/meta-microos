SUMMARY = "A LaTeX package for preparing manuscripts for the journal EMISA"
DESCRIPTION = "The EMISA LaTeX package is provided for preparing manuscripts \
for submission to EMISA (Enterprise Modelling and Information \
Systems Architectures), and for preparing accepted submissions \
for publication as well as for typesetting the final document \
by the editorial office. Articles in EMISA are published online \
at EMISA in the Portable Document Format (PDF)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.0svn71883"

RPM_NAME = "texlive-emisa-2026.226.2.3.0svn71883-61.4.noarch.rpm"
RPM_HASH = "3f06eca5f48a63281aea65699a4e95b8659a6bcd194177482f0672d7d7149adf0c2167ebdf90b6da0f2c8f7b754062590e90d1c1ca6799f7ba169a38d24609cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emisa.bbx \
tex-emisa.cbx \
tex-emisa.cls \
texlive-emisa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-authoryear-comp.cbx \
tex-authoryear.bbx \
tex-babel.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-newtxtt.sty \
tex-ntheorem.sty \
tex-paralist.sty \
tex-placeins.sty \
tex-textcomp.sty \
tex-twoopt.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
