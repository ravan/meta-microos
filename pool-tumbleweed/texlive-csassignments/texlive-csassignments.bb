SUMMARY = "A wrapper for article with macros and customizations for computer science assignments"
DESCRIPTION = "This class wraps the default article and extends it for a \
homogeneous look of hand-in assignments at university (RWTH \
Aachen University, Computer Science Department), specifically \
in the field of computer science, but easily extensible to \
other fields. It provides macros for structuring exercises, \
aggregating points, and displaying a grading table, as well as \
several macros for easier math mode usage."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77161"

RPM_NAME = "texlive-csassignments-2026.226.1.0.2svn77161-61.2.noarch.rpm"
RPM_HASH = "1e761dae5a194106f89bb6a1678143f6cabde2793dd6b5ffd9c2202003784c51e72f0a21b028e2bb9a0d1b4807e71a8753b4a6777a42babd6de7914f88067f1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csassignments.cls \
texlive-csassignments"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-babel.sty \
tex-changepage.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-pdfpages.sty \
tex-stmaryrd.sty \
tex-suffix.sty \
tex-tgpagella.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-totcount.sty \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
