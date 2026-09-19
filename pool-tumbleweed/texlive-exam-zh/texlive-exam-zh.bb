SUMMARY = "LaTeX template for Chinese exams"
DESCRIPTION = "Although there are already several excellent exam packages or \
classes like exam and bhcexam, these do not fit the Chinese \
style very well, or they cannot be customized easily for \
Chinese exams of all types, like exams in primary school, \
junior high school, senior high school and even college. This \
is the main reason why this package was created. This package \
provides a class exam-zh.cls and several module packages like \
exam-zh-question.sty and exam-zh-choices.sty, where these \
module packages can be used individually. Using exam-zh you can \
separate the format and the content very well; use the choices \
environment to typeset choice items easily and automatically; \
design the seal line easily; and more (see manual)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.6svn76834"

RPM_NAME = "texlive-exam-zh-2026.226.0.0.2.6svn76834-59.2.noarch.rpm"
RPM_HASH = "fdad9b87ac74786618bb3f7d7b4205b880b37d9e75439899b731ffae9608e7d81effc33fd295cde0be20b22ec2d761dc6eea66e510b22cb7ceeadb11cd4003e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam-zh-chinese-english.sty \
tex-exam-zh-choices.sty \
tex-exam-zh-font.sty \
tex-exam-zh-math.sty \
tex-exam-zh-question.sty \
tex-exam-zh-symbols.sty \
tex-exam-zh-textfigure.sty \
tex-exam-zh.cls \
texlive-exam-zh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsthm.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-filehook.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lastpage.sty \
tex-linegoal.sty \
tex-pifont.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-tikzpagenodes.sty \
tex-unicode-math.sty \
tex-varwidth.sty \
tex-wrapstuff.sty \
tex-xeCJK.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
