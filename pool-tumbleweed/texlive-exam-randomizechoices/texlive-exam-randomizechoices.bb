SUMMARY = "Randomize mc choices using the exam class"
DESCRIPTION = "This package is an extension to the exam document class. It \
provides the user with four new multiple choice typesetting \
environments which place their content in a random order. It \
can (only) be used in combination with the exam class. It can \
only randomize the placement of choices in multiple choice \
questions. The questions themselves cannot be randomized with \
this package. Furthermore, the package provides a simple answer \
key table typesetter and has a command for writing the answer \
keys to an external file."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn61719"

RPM_NAME = "texlive-exam-randomizechoices-2026.226.0.0.2svn61719-59.2.noarch.rpm"
RPM_HASH = "fb6da7b0a5637ca37473d7c834afe038c900ca4d43404da0f946a35885084f66e138d299821c17e18c79619ac92bfb1f282a93b46d8cf5640cb03e65ce8e9643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam-randomizechoices.sty \
texlive-exam-randomizechoices"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-etoolbox.sty \
tex-pgffor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
