SUMMARY = "Graphical representation of keys on keyboard"
DESCRIPTION = "A LaTeX package which provides macros for the graphical \
representation of the keys on a computer keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-keystroke-2026.226.1.6svn77682-63.2.noarch.rpm"
RPM_HASH = "098c766d6df139c3cd6a584657d39bf8700e2bfc91e082c9297acfb96e83f8d446d557c4683a1630f357f7b2b973abea8a5fa61769c03a0adb6f6c2ba1423bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keystroke.sty \
texlive-keystroke"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
