SUMMARY = "Icons for tabletop role-playing games"
DESCRIPTION = "This package provides a set of high-quality icons for use in \
notes for tabletop role-playing games. The icons are meant to \
be used in the body text, but they can also be used in other \
contexts such as graphics or diagrams. The package comes in two \
variants, one based on the l3draw package, and the other on \
PGF/TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6.0svn78136"

RPM_NAME = "texlive-rpgicons-2026.226.2.6.0svn78136-60.2.noarch.rpm"
RPM_HASH = "b9d4d3be3175fcaa29ae22030536548b8a4b567e396bbc0fbb73ce34dcd171674942ac8d629bde451baf033ff2363e576e3f71be6f68d3a9cf95f101912aafbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rpgicons-l3.sty \
tex-rpgicons-pgf.sty \
tex-rpgicons.sty \
texlive-rpgicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3draw.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
