SUMMARY = "Typesetting exercise or exam sheets"
DESCRIPTION = "The exesheet package is designed for typesetting exercise or \
exam sheets. The primary advantage of exesheet is its ability \
to display a detailed scoring guide and correction instructions \
as needed. This feature is especially beneficial for grading \
papers with multiple graders. The exesheet package provides \
macros for organizing exercises and subparts, specific settings \
for enumeration lists, environments for questions and answers, \
which can be displayed or hidden, macros for detailed comments \
and grading instructions in the margins which can be displayed \
or hidden. Additionally, the exesheet class loads the \
schooldocs package which manages the page layout, the main \
title, headers and footers."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn75102"

RPM_NAME = "texlive-exesheet-2026.226.2.9svn75102-59.2.noarch.rpm"
RPM_HASH = "13b6b46308f395abeb63bfdab7a8ef545be8f476b616cee8cb86d15a2b46f87921d11399382fe86e9debf923e2cc5ab6e42fb32a15e9ee071b7fa85059d59e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exesheet.cls \
tex-exesheet.sty \
texlive-exesheet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-enumitem.sty \
tex-fancybox.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-mparhack.sty \
tex-multicol.sty \
tex-ragged2e.sty \
tex-schooldocs.sty \
tex-tasks.sty \
tex-translations.sty \
tex-versions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
