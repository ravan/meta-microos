SUMMARY = "Commands for 'turtle operations'"
DESCRIPTION = "This is a PSTricks related package for creating 'Turtle' \
graphics. It supports the commands forward, back, left, right, \
penup, and pendown."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-2026.226.0.0.02svn52261-60.4.noarch.rpm"
RPM_HASH = "16b3972077130b9b0754feb818906d7de33b84bcddd8f9c7a7c5b419f68375714d06cdec90729f95ea0bee2e4530a51ab0779e7d9dc602e6c6502ceb26dfed8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-turtle.sty \
tex-pst-turtle.tex \
texlive-pst-turtle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
