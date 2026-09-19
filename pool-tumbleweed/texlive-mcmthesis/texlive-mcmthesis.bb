SUMMARY = "Template designed for MCM/ICM"
DESCRIPTION = "The package offers a template for MCM (The Mathematical Contest \
in Modeling) and ICM (The Interdisciplinary Contest in \
Modeling) for typesetting the submitted paper."
LICENSE = "LPPL-1.0"

PV = "2026.226.6.3.3svn69538"

RPM_NAME = "texlive-mcmthesis-2026.226.6.3.3svn69538-59.2.noarch.rpm"
RPM_HASH = "bc496f49ab378d84f8429145d5526c73675592ed5d974c10531b91b7cb329af6ac16003ceab7c7df5d0c075ba4855fdf84127dd0f7d46c535fa3dfa4923c3697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mcmthesis.cls \
texlive-mcmthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-appendix.sty \
tex-array.sty \
tex-article.cls \
tex-berasans.sty \
tex-bm.sty \
tex-bmpsize.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-colortbl.sty \
tex-environ.sty \
tex-epstopdf.sty \
tex-etoolbox.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-flafter.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hhline.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-latexsym.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mathrsfs.sty \
tex-multirow.sty \
tex-paralist.sty \
tex-pifont.sty \
tex-tabularx.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
