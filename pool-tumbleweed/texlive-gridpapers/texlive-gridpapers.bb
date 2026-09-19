SUMMARY = "Graph paper backgrounds and color schemes"
DESCRIPTION = "This package provides many preset yet customizable graph paper \
backgrounds. Some of the preset patterns include standard \
quadrille or graph pattern, dot grid, hexagons, isometric or \
triangular grid, squares with 45deg 'light cone' lines, ruled, \
and more. Pattern sizes can be controlled via package options. \
There are several preset color palletes, and colors can be \
overridden. The package uses the PGF/TikZ package, and the \
geometry package to control page size."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn58723"

RPM_NAME = "texlive-gridpapers-2026.226.1.0.2svn58723-60.4.noarch.rpm"
RPM_HASH = "92a49bb058c8453a3306d9a8c1b3e05ad253b5cbbee1d7190b6c361111a90867d267203776c9a31a4d1b5fefbd800210698760cdda38d3822a2566b40efd3090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gridpapers.sty \
texlive-gridpapers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage-1x.sty \
tex-everypage.sty \
tex-geometry.sty \
tex-kvoptions.sty \
tex-pagecolor.sty \
tex-tikz.sty \
tex-tikzpagenodes.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
