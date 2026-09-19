SUMMARY = "Thesis template for Eotvos Lorand University (Informatics)"
DESCRIPTION = "This package provides a Bachelor and Master thesis template for \
the Eotvos Lorand University, Faculty of Informatics (Budapest, \
Hungary). The template supports producing both Hungarian and \
English theses."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn71087"

RPM_NAME = "texlive-elteikthesis-2026.226.2.4svn71087-61.4.noarch.rpm"
RPM_HASH = "469bfe438e6afc80e40172134fc3de49d975eb02134429a6ba5776d18530a1743338012903055bd22d4913b14f85f280d3cf3f154ef1067bd38e1f45e4e33d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elteikthesis.cls \
texlive-elteikthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-algorithm.sty \
tex-algpseudocode.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-appendix.sty \
tex-array.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-caption.sty \
tex-chngcntr.sty \
tex-color.sty \
tex-csquotes.sty \
tex-epstopdf.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-listingsutf8.sty \
tex-longtable.sty \
tex-makecell.sty \
tex-makeidx.sty \
tex-multirow.sty \
tex-nomencl.sty \
tex-paralist.sty \
tex-parskip.sty \
tex-pdfpages.sty \
tex-preview.sty \
tex-report.cls \
tex-rotating.sty \
tex-setspace.sty \
tex-subcaption.sty \
tex-tocloft.sty \
tex-todonotes.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
