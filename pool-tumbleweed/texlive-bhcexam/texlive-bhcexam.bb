SUMMARY = "An exam class for mathematics teachers in China"
DESCRIPTION = "BHCexam.cls is a LaTeX document class designed for typesetting \
exams. It is currently used by the Mathcrowd Problem Database \
to generate exam PDF files. The class supports the following \
features: Support for configuring whether to display answers. \
Ability to set whether the document is formatted in multiple \
columns. Alignment customization options. Automatic alignment \
of option lengths to a grid. Ability to adjust the width of \
blank lines based on the length of fill-in-the-blank answers. \
Option to display or hide scores for question groups. \
Customizable answer space for each question. Ability to restart \
numbering in question groups. Support for sub-questions and \
nested sub-questions in short-answer questions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn72638"

RPM_NAME = "texlive-bhcexam-2026.226.1.8svn72638-61.2.noarch.rpm"
RPM_HASH = "dfdb226bb267bdbd98b564043f36946c01a667596db63765123e0a069d152faf87bbebfbc342debb423164b9669670850c331177d42f45c0408df64aafde2acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BHCexam.cls \
texlive-bhcexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-bbding.sty \
tex-caption.sty \
tex-ctex.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-pifont.sty \
tex-romannum.sty \
tex-tabularx.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
