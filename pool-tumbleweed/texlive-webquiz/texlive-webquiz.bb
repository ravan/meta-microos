SUMMARY = "Write interactive web based quizzes"
DESCRIPTION = "WebQuiz makes it possible to use LaTeX to write interactive web \
based quizzes. The quizzes are first written in LaTeX and then \
converted into HTML files using WebQuiz, which is written in \
Python3. The conversion from LaTeX to HTML is done behind the \
scenes using TeX4ht."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.5.2svn58808"

RPM_NAME = "texlive-webquiz-2026.226.5.2svn58808-60.2.noarch.rpm"
RPM_HASH = "23084d1ab704b2db2e2f32eff456e75b27ff7d3e9bb5e7a46d973ff60f099456129373454ada527b68a262e91cf50608f68a620a47498af41b6b3fb1e8d8a017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-webquiz-doc.code.tex \
tex-webquiz-ini.code.tex \
tex-webquiz.cfg \
tex-webquiz.cls \
texlive-webquiz"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-article.cls \
tex-bbding.sty \
tex-etoolbox.sty \
tex-pgffor.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-webquiz-bin"

inherit rpm
