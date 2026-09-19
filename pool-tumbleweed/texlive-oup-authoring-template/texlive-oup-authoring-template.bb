SUMMARY = "A general template for journals published by Oxford University Press (OUP)"
DESCRIPTION = "This package provides a general LaTeX template for journals \
published by Oxford University Press (OUP). The template \
outputs to the three official page designs (traditional, \
contemporary, modern) used by many journals published by OUP, \
with large, medium and small page options. For more information \
see \
https://academic.oup.com/journals/pages/authors/preparing_your_ \
manuscript."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn78219"

RPM_NAME = "texlive-oup-authoring-template-2026.226.1.2svn78219-61.2.noarch.rpm"
RPM_HASH = "d67ecc634b124ed39b84ed26a8aa0829abbbc3ca83040cc59d1d49e286d0099e5e900c430eede9dd4a4290f23437c20b9a9d57958b4febbc08cb2250a257544b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oup-authoring-template.cls \
texlive-oup-authoring-template"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algorithmicx.sty \
tex-algpseudocode.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-array.sty \
tex-arydshln.sty \
tex-caption.sty \
tex-chngpage.sty \
tex-color.sty \
tex-crop.sty \
tex-fix-cm.sty \
tex-flushend.sty \
tex-footmisc.sty \
tex-footnote.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-mathrsfs.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-rotating.sty \
tex-silence.sty \
tex-stfloats.sty \
tex-subfloat.sty \
tex-tikz.sty \
tex-totcount.sty \
tex-url.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
