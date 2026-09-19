SUMMARY = "Draw commutative diagrams exported from https://q.uiver.app"
DESCRIPTION = "quiver is a modern graphical editor for commutative and pasting \
diagrams, capable of rendering high-quality diagrams for screen \
viewing, and exporting to LaTeX. This LaTeX package is intended \
to be used in conjunction with the editor, and provides the \
packages and styles that are used by diagrams exported from the \
editor."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.0svn77816"

RPM_NAME = "texlive-quiver-2026.226.1.6.0svn77816-60.4.noarch.rpm"
RPM_HASH = "1231460262f76766de0485bf03a9819817d3f260db4ad76823816d6d2a31045f72164090a92682e5a97ae21190e29c117db2e46e10084d337b81ed10b7a09bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quiver.sty \
texlive-quiver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-tikz-cd.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
