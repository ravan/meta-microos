SUMMARY = "Horizontally columned lists"
DESCRIPTION = "The reason for the creation of the tasks environment was an \
unwritten agreement in German maths textbooks (especially \
(junior) high school textbooks) to organize exercises in \
columns counting horizontally rather than vertically. This is \
what the tasks package helps to achieve."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.4asvn77682"

RPM_NAME = "texlive-tasks-2026.227.1.4asvn77682-62.2.noarch.rpm"
RPM_HASH = "f95300d9c40b51764a437d394ef86de69f5504d9ce29bfc89ad2c309b69e0fe51b9560d63767208d213c74b8c9e12308d86fe3a095da699805264fd11c225480"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tasks.cfg \
tex-tasks.sty \
texlive-tasks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
