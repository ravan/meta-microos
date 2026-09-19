SUMMARY = "Computes and draws 2D Delaunay triangulation"
DESCRIPTION = "The package allows to compute and draw 2D Delaunay \
triangulation. The algorithm is written with lua, and depending \
upon the choice of the engine, the drawing is done by MetaPost \
(with luamplib) or by TikZ. The Delaunay triangulation \
algorithm is the Bowyer and Watson algorithm. Several macros \
are provided to draw the global mesh, the set of points, or a \
particular step of the algorithm."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-luamesh-2026.226.0.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "9cd56a07dddb230d5a452c7a5d3797c76fcc6a642fc076cd0675fe1e19d84f34023956300bca68dda4bafe65b1dbdf2f2fb57b1c52e0ca8ef78022c8f4bbd085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamesh.sty \
texlive-luamesh"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-luamplib.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
