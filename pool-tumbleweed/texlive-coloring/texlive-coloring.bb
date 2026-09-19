SUMMARY = "Define missing colors by their names"
DESCRIPTION = "This package makes it possible to define colors automatically \
by their names. This can be useful in drawing TikZ pictures and \
designing beamer themes. Using the package, you don't need to \
write \\definecolor before using a color."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn41042"

RPM_NAME = "texlive-coloring-2026.226.0.0.2svn41042-60.2.noarch.rpm"
RPM_HASH = "4333edd2d316ea7e69528d80b2ce8320f938303588e674042680061f8fea5c0eb6c1c12456c3dc5d44986ddc8b97cf9635bc3bd6ee3bb7e3af6af154e3542b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coloring.sty \
texlive-coloring"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
