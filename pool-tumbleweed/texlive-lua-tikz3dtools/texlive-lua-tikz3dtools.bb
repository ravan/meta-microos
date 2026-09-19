SUMMARY = "Not-so-experimental LuaLaTeX package for 3D illustrations in TikZ"
DESCRIPTION = "This package improves on existing 3D capabilities in TikZ. In \
particular, the package enables z-sorting of multiple \
triangulated parametric objects and uses elaborate clipping and \
occlusion logic. The parametric objects are defined using \
pgfkeys, and endeavor to enable user customization. All of the \
3D math is handled in Lua, and the results are projected onto \
the 2D TikZ canvas. The user is enabled to use linear, affine \
and projective transformations on their parametric objects."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.0svn77682"

RPM_NAME = "texlive-lua-tikz3dtools-2026.226.2.3.0svn77682-59.2.noarch.rpm"
RPM_HASH = "a870fa0232818e9b3baa3821c2eb09c032c81eea401a9ea2935214b3a78d3d0753ea7df7cf3ca9ba0c0f04d5823e2dc1b2b56efb9baf90ce16cba023e7a1cca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-tikz3dtools.sty \
texlive-lua-tikz3dtools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
