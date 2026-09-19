SUMMARY = "Typeset exams with scrambled questions and answers"
DESCRIPTION = "The package enables the user to typeset exams with multiple \
choice, open questions and many other types of exercise. Both \
questions and answers may be randomly distributed within the \
exam, and the solutions are typeset automatically. Exercises \
may contain a wide number of random parameters and it is \
possible to do arithmetical operations on them. The package is \
localised in Italian, English, French, German, Greek, Serbian, \
and Spanish."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn71883"

RPM_NAME = "texlive-esami-2026.226.2.9svn71883-61.4.noarch.rpm"
RPM_HASH = "19cd651907927fed6f90a41ee11ca0fc4d0f620f4b11a5a105090ced54e97c25382732bb18519db5d0c4b2f40bfc98a57b667496141616d27786b27a3e9d8ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esami.sty \
texlive-esami"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-auto-pst-pdf.sty \
tex-currfile.sty \
tex-enumerate.sty \
tex-environ.sty \
tex-fp.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
tex-tagpdf-base.sty \
tex-xargs.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
