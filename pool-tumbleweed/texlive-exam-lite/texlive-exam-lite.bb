SUMMARY = "Quicker preparation of exams in LaTeX"
DESCRIPTION = "This template is devoted to the quicker preparation of exams in \
LaTeX. Its main features are: Minimalistic design. Include the \
custom logo of the affiliation. Predefined commands for a \
subject, study year, study program, exam type, place of exam, \
date. Many macros contained in this package speed up the \
process of preparing the necessary ingredients for the exam. \
Automatic calculation of total points."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65754"

RPM_NAME = "texlive-exam-lite-2026.226.svn65754-59.2.noarch.rpm"
RPM_HASH = "1c81c12e335a8219a369ac9a1d89c69d17af626ed0a42d97121629cdb3d9ee30f33a78ddcb21171d1a39d3a3cc2af6592b04bd020af0bd31d47958dd2c73580f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam-lite.cls \
texlive-exam-lite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-datetime.sty \
tex-enumerate.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-lipsum.sty \
tex-parskip.sty \
tex-totcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
