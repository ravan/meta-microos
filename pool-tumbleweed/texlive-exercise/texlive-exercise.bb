SUMMARY = "Typeset exercises, problems, etc. and their answers"
DESCRIPTION = "The package helps to typeset exercises or list of exercises \
within any document. Exercises, questions and sub-questions are \
automatically numbered. It is possible to put answers in the \
same document, and display them immediately, later in the \
document or not to print answers at all. The layout of \
exercises is fully customisable. It is possible to typeset long \
problems, short exercises, questionnaires, etc. Usage of the \
babel package is detected, but not fully supported yet (only \
English and French are implemented)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn76924"

RPM_NAME = "texlive-exercise-2026.226.1.6svn76924-59.2.noarch.rpm"
RPM_HASH = "2fa5f112177e574343544eb870d8c6784a45689e9c0fd7cd1607aa94317e5b4c3297119d55b0b2900030bfa3a300d3d349186bb5b47f8ac55789a1564c4a821d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercise.sty \
texlive-exercise"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
