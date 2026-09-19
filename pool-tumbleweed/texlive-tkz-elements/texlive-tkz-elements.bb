SUMMARY = "A Lua library for drawing Euclidean geometry with TikZ or tkz-euclide"
DESCRIPTION = "This package provides a library written in Lua, allowing to \
make all the necessary calculations to define the objects of a \
Euclidean geometry figure. You need to compile with LuaLaTeX. \
The definitions and calculations are only done with Lua. The \
main possibility of programming proposed is oriented 'object \
programming' with object classes like point, line, triangle, \
circle and now, conic. For the moment, once the calculations \
are done, it is tkz-euclide or TikZ which allows the drawings."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.02csvn78006"

RPM_NAME = "texlive-tkz-elements-2026.226.5.02csvn78006-59.2.noarch.rpm"
RPM_HASH = "97411e58242133cacc7e7af1a3b85a68f0aa91fd6fc0abe68af03288c7b537121788839838112f4c0379f2c3289558d41f93cb4675dee1a2de27476a306e16a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-elements.sty \
texlive-tkz-elements"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
