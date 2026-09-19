SUMMARY = "Produces calculator's keys with the help of TikZ"
DESCRIPTION = "The package provides commands to draw calculator keys with the \
help of TikZ. It also provides commands to draw the content of \
screens and of menu items."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn38646"

RPM_NAME = "texlive-tipfr-2026.226.1.5svn38646-59.2.noarch.rpm"
RPM_HASH = "a2d89646bdaee1697246cac309081c6523103eebcf3ab89040c2de28ee092469d33be607cd3ab3de612585b6b66d2a83e73e403025c40f31ba82dc2d2ee8db60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tipfr.sty \
texlive-tipfr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-multido.sty \
tex-newtxtt.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
