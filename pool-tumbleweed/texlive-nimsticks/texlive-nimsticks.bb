SUMMARY = "Draws sticks for games of multi-pile Nim"
DESCRIPTION = "This LaTeX package provides commands \\drawnimstick to draw a \
single nim stick and \\nimgame which represents games of \
multi-pile Nim. Nim sticks are drawn with a little random \
wobble so they look 'thrown together' and not too regular. The \
package also provides options to customise the size and colour \
of the sticks, and flexibility to draw heaps of different \
objects."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.1svn64118"

RPM_NAME = "texlive-nimsticks-2026.226.2.0.1svn64118-61.2.noarch.rpm"
RPM_HASH = "0d94e6e0df1a0b40fcc1e9ab6a44e8ffeff38d553c8ece280f0a49b1d09d5fc1513ad0df8f324279addf2b384dc4650942dccbf7a2239199fdceb4db23c6398f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nimsticks.sty \
texlive-nimsticks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-lcg.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
