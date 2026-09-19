SUMMARY = "Create mathematical manuals for schools"
DESCRIPTION = "This package enables LaTeX users to create math books for \
middle and high schools. It provides commands to create the \
front page of the manual and the chapters. Each chapter can \
consist of three sections: the lesson, the exercises and the \
activities."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn54080"

RPM_NAME = "texlive-fascicules-2026.226.1svn54080-59.2.noarch.rpm"
RPM_HASH = "30c8e5250a92daa904b4d638229b52125afa51a8f0a93087abd54888f5d43e327d4ee24c8ac237f91bf6e25e28c356eb9553e62b5ab3e836e7d75af67cd0e526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fascicules.sty \
texlive-fascicules"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-answers.sty \
tex-beamerarticle.sty \
tex-calc.sty \
tex-cleveref.sty \
tex-comment.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-multicol.sty \
tex-nameref.sty \
tex-pgfopts.sty \
tex-scrlayer-scrpage.sty \
tex-tagging.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xcomment.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
