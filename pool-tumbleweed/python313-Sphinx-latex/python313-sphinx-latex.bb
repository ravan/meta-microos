SUMMARY = "Sphinx packages for LaTeX"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the LaTeX components for python-Sphinx."
LICENSE = "BSD-2-Clause"

PV = "9.1.0"

RPM_NAME = "python313-Sphinx-latex-9.1.0-2.1.noarch.rpm"
RPM_HASH = "fbed507bacc16fb17a2c605803111d10054d18f2de676ba87059c4d59a0dd92a13ee3129dbfd0235fa04c1d5facd16c2e14c8f0a95942957a39c62ec0b16751f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Sphinx-latex \
python313-Sphinx-latex"

RDEPENDS:${PN} += "python313-Sphinx \
tex-8r.enc \
tex-alltt.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-array.sty \
tex-article.cls \
tex-atbegshi.sty \
tex-babel.sty \
tex-bm.sty \
tex-capt-of.sty \
tex-cmap.sty \
tex-color.sty \
tex-colortbl.sty \
tex-dvipdfmx.def \
tex-english.ldf \
tex-eqparbox.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-fancyvrb.sty \
tex-float.sty \
tex-fncychap.sty \
tex-fontenc.sty \
tex-footnote.sty \
tex-framed.sty \
tex-graphics.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-longtable.sty \
tex-luatex85.sty \
tex-makeidx.sty \
tex-multirow.sty \
tex-needspace.sty \
tex-newfloat.sty \
tex-palatino.sty \
tex-parskip.sty \
tex-pcrr.tfm \
tex-pdftex.def \
tex-pdftex.map \
tex-phvr.tfm \
tex-polyglossia.sty \
tex-pplr.tfm \
tex-preview.sty \
tex-ptmr.tfm \
tex-pzcmi.tfm \
tex-tabulary.sty \
tex-textcomp.sty \
tex-tgtermes.sty \
tex-threeparttable.sty \
tex-times.sty \
tex-titlesec.sty \
tex-upquote.sty \
tex-utf8.def \
tex-utf8x.def \
tex-varwidth.sty \
tex-wrapfig.sty \
texlive-dvipng \
texlive-gnu-freefont \
texlive-latex \
texlive-latexmk \
texlive-makeindex \
texlive-metafont \
texlive-pdftex"

inherit rpm
