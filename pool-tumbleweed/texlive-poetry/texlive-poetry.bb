SUMMARY = "Facilities for typesetting poetry and poetical structure"
DESCRIPTION = "This package provides some macros and general doodads for \
typesetting poetry. There is, of course, already the excellent \
verse package, and the poetrytex package provides some extra \
functionality on top of it. But poetry provides much of the \
same functionality in a bit of a different way, and with a few \
additional abilities, such as facilities for a list of poems, \
an index of first lines, and some structural commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-poetry-2026.226.2.2svn77682-59.2.noarch.rpm"
RPM_HASH = "e80b28a1d812ba58c87802cdfee824801ffb1f806257d5af6894eb4644fb0d839e1941b4b6982412814abb16b99dd1415fe5aa3ea433fd864239e4864be3e0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poetry.sty \
texlive-poetry"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-imakeidx.sty \
tex-modulus.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
