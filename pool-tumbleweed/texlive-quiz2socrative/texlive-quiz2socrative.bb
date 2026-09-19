SUMMARY = "Prepare questions for socrative quizzes"
DESCRIPTION = "This is a LaTeX package for preparing multiple choice, \
true/false, and short answer questions. Its main purpose is to \
offer a tool to easily insert rather complicated mathematical \
material in socrative quizzes (see https://socrative.com). The \
package requires the following other LaTeX packages: calc, \
etoolbox, graphicx, ifthen, listofitems, moresize, TikZ, \
pgfmath, xcolor, and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn52276"

RPM_NAME = "texlive-quiz2socrative-2026.226.1.0svn52276-60.4.noarch.rpm"
RPM_HASH = "6b7aef7f02689e1ca9108d895649169f545b32f57dd9439f76c044136811228645d7adebb71f885ed3c71cca3476e659b9303b7a28ab484ecdadc7def701362a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quiz2socrative.sty \
texlive-quiz2socrative"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-moresize.sty \
tex-pgfmath.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
