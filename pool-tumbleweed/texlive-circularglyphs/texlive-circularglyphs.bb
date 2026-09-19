SUMMARY = "A circular glyphs alphabet"
DESCRIPTION = "Circular Glyphs is a graphic alphabet of substitution based on \
a geometric construction using circles and arcs on a grid. The \
designs are all based on circular arcs, divided into four \
quadrants. It is inspired by Star Trek and used by the Bynar \
and Borg cultures depicted there."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-circularglyphs-2026.226.0.0.1.1svn73069-60.2.noarch.rpm"
RPM_HASH = "75986fae900e2e19eb881c226792f735e35c53408ce9fd91033e1e009e07fbf8f81f6b8ad5c91c136d68a7472f0e210ef45a0705439d3cfdf72b2a0eb275d22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-circularglyphs.sty \
texlive-circularglyphs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
