SUMMARY = "Draw chord diagrams"
DESCRIPTION = "This package provides two macros for drawing chord diagrams, as \
may be found for example in chord charts/books and educational \
materials. They are composed as TikZ pictures and have several \
options to modify their appearance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51000"

RPM_NAME = "texlive-chordbox-2026.226.1.0svn51000-60.2.noarch.rpm"
RPM_HASH = "2c21dc4b81877949a6b886c469173504efb464cd6877c3e422c76d3194eaa5110bf09d90850f1d1613cacae979ca75a2c58150fd4aa560e5600ab2d4fae84633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chordbox.sty \
texlive-chordbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
