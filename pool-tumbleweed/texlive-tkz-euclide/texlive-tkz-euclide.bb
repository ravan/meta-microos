SUMMARY = "Tools for drawing Euclidean geometry"
DESCRIPTION = "The tkz-euclide package is a set of files designed to give math \
teachers and students easy access to the programming of \
Euclidean geometry with TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.13csvn77515"

RPM_NAME = "texlive-tkz-euclide-2026.226.5.13csvn77515-59.2.noarch.rpm"
RPM_HASH = "e5c76b5c71c7e1fd0e4eb4050621e8740540891c4add3cd60fc3aba97df948f9cb0d7bc82c18526ccb159e901cfdd1600083c6ee16cfd4202c3e4d1c44c7bec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-draw-eu-angles.tex \
tex-tkz-draw-eu-arcs.tex \
tex-tkz-draw-eu-circles.tex \
tex-tkz-draw-eu-compass.tex \
tex-tkz-draw-eu-ellipses.tex \
tex-tkz-draw-eu-lines.tex \
tex-tkz-draw-eu-points.tex \
tex-tkz-draw-eu-polygons.tex \
tex-tkz-draw-eu-protractor.tex \
tex-tkz-draw-eu-sectors.tex \
tex-tkz-draw-eu-show.tex \
tex-tkz-euclide.cfg \
tex-tkz-euclide.sty \
tex-tkz-lib-eu-marks.tex \
tex-tkz-lib-eu-shape.tex \
tex-tkz-obj-eu-axesmin.tex \
tex-tkz-obj-eu-circles-by.tex \
tex-tkz-obj-eu-circles.tex \
tex-tkz-obj-eu-grids.tex \
tex-tkz-obj-eu-lines.tex \
tex-tkz-obj-eu-lua-circles-by.tex \
tex-tkz-obj-eu-lua-circles.tex \
tex-tkz-obj-eu-lua-points-by.tex \
tex-tkz-obj-eu-lua-points-spc.tex \
tex-tkz-obj-eu-lua-points-with.tex \
tex-tkz-obj-eu-lua-points.tex \
tex-tkz-obj-eu-points-by.tex \
tex-tkz-obj-eu-points-rnd.tex \
tex-tkz-obj-eu-points-spc.tex \
tex-tkz-obj-eu-points-with.tex \
tex-tkz-obj-eu-points.tex \
tex-tkz-obj-eu-polygons.tex \
tex-tkz-obj-eu-triangles.tex \
tex-tkz-tools-eu-BB.tex \
tex-tkz-tools-eu-angles.tex \
tex-tkz-tools-eu-base.tex \
tex-tkz-tools-eu-colors.tex \
tex-tkz-tools-eu-intersections.tex \
tex-tkz-tools-eu-lua-angles.tex \
tex-tkz-tools-eu-lua-base.tex \
tex-tkz-tools-eu-lua-intersections.tex \
tex-tkz-tools-eu-lua-math.tex \
tex-tkz-tools-eu-math.tex \
tex-tkz-tools-eu-modules.tex \
tex-tkz-tools-eu-text.tex \
tex-tkz-tools-eu-utilities.tex \
texlive-tkz-euclide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
tex-tikz.sty \
tex-xfp.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
