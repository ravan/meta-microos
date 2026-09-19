SUMMARY = "Collaborative annotation tool for LaTeX"
DESCRIPTION = "FiXme is a collaborative annotation tool for LaTeX documents. \
Annotating a document here refers to inserting meta-notes, that \
is, notes that do not belong to the document itself, but rather \
to its development or reviewing process. Such notes may involve \
things of different importance levels, ranging from simple 'fix \
the spelling' flags to critical 'this paragraph is a lie' \
mentions. Annotations like this should be visible during the \
development or reviewing phase, but should normally disappear \
in the final version of the document. FiXme is designed to ease \
and automate the process of managing collaborative annotations, \
by offering a set of predefined note levels and layouts, the \
possibility to register multiple authors, to reference \
annotations by listing and indexing etc. FiXme is extensible, \
giving you the possibility to create new layouts or even \
complete 'themes', and also comes with support for AUCTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.5svn77682"

RPM_NAME = "texlive-fixme-2026.226.4.5svn77682-59.2.noarch.rpm"
RPM_HASH = "e7155857e21bec0957701984918af55b3b73b251c9a1374615ce22f2d498b454c03a5a29a83aeef98e13e268ed5b918e63a66251842b7d20c824493f637a3f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixme.sty \
tex-fxenvlayoutcolor.sty \
tex-fxenvlayoutcolorsig.sty \
tex-fxlayoutmarginnote.sty \
tex-fxlayoutpdfcmargin.sty \
tex-fxlayoutpdfcnote.sty \
tex-fxlayoutpdfcsigmargin.sty \
tex-fxlayoutpdfcsignote.sty \
tex-fxlayoutpdfmargin.sty \
tex-fxlayoutpdfnote.sty \
tex-fxlayoutpdfsigmargin.sty \
tex-fxlayoutpdfsignote.sty \
tex-fxtargetlayoutchangebar.sty \
tex-fxtargetlayoutcolor.sty \
tex-fxtargetlayoutcolorcb.sty \
tex-fxthemecolor.sty \
tex-fxthemecolorsig.sty \
tex-fxthemesignature.sty \
texlive-fixme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-changebar.sty \
tex-color.sty \
tex-ifthen.sty \
tex-marginnote.sty \
tex-pdfcomment.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
