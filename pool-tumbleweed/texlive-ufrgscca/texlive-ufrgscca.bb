SUMMARY = "A bundle for undergraduate students final work/report (tcc) at UFRGS/EE"
DESCRIPTION = "This bundle is aimed at producing undergraduate students' final \
work/report at UFRGS/EE (Engineering School at the Federal \
University of Rio Grande do Sul), closely following ABNT rules \
(Brazilian Association for Technical Norms). It is composed of \
a main class, ufrgscca, and a set of auxiliary packages, some \
of which can be used independently."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.13svn77050"

RPM_NAME = "texlive-ufrgscca-2026.226.2.13svn77050-60.2.noarch.rpm"
RPM_HASH = "9cb3e5d49e53185a5b6bd493302d66d2adfaff4d2aa32c7bb824c92fc0eec742d5ba962dc2634d713e35d3332bf7f9aa5a0d398f40ef95df27622fd675cca00c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ufrgscca-abnt.sty \
tex-ufrgscca-base-en.def \
tex-ufrgscca-base-ptBR.def \
tex-ufrgscca-coord.sty \
tex-ufrgscca-core.sty \
tex-ufrgscca-cover-ptBR.tex \
tex-ufrgscca-cover.sty \
tex-ufrgscca-curr.sty \
tex-ufrgscca-forms.sty \
tex-ufrgscca-forms.tex \
tex-ufrgscca-lists.sty \
tex-ufrgscca-ppc.sty \
tex-ufrgscca-terms-ptBR.tex \
tex-ufrgscca.cls \
texlive-ufrgscca"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-appendix.sty \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-biblatex.sty \
tex-bigdelim.sty \
tex-caption.sty \
tex-chngcntr.sty \
tex-circuitikz.sty \
tex-codedescribe.sty \
tex-contour.sty \
tex-csquotes.sty \
tex-empheq.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-extarrows.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-mathfixs.sty \
tex-mathptmx.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-mdframed.sty \
tex-microtype.sty \
tex-multirow.sty \
tex-newfloat.sty \
tex-nicematrix.sty \
tex-pdfcomment.sty \
tex-pgfcalendar.sty \
tex-pkginfograb.sty \
tex-relsize.sty \
tex-report.cls \
tex-showframe.sty \
tex-showlabels.sty \
tex-silence.sty \
tex-soul.sty \
tex-starray.sty \
tex-steinmetz.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
