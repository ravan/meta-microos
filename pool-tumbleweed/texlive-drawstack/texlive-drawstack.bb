SUMMARY = "Draw execution stacks"
DESCRIPTION = "This simple LaTeX package provides support for drawing \
execution stack (typically to illustrate assembly language \
notions). The code is written on top of TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28582"

RPM_NAME = "texlive-drawstack-2026.226.svn28582-59.2.noarch.rpm"
RPM_HASH = "cd4ac0f36fff1ac397a136f7a465391629051603bd74f5427597f48aa9d03222f933de088e7984dd26101d0bf905882cb72f16a24d06eb3f36ddcb5aade26ad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drawstack.sty \
texlive-drawstack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
