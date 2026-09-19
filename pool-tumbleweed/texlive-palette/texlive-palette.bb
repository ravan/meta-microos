SUMMARY = "Create palettes for colors and symbols that can be swapped in"
DESCRIPTION = "The package `palette` contains two files: `colorpalette.sty` \
and `symbolpalette`. One deals with colors and the other deals \
with symbols; the implementation is quite similar. With this \
package you can create themes. Each of these themes have a set \
of colors, and you can create palettes based on this theme with \
specific color values for each of the theme's color slots. The \
active palette for each theme can be swapped in to make \
experimenting with colors easier or give users choices as to \
which theme they pick."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn60119"

RPM_NAME = "texlive-palette-2026.226.1.1.0svn60119-58.2.noarch.rpm"
RPM_HASH = "6debbc802a6eb9181b797ad0e039e426dc78509ccd63a6cd6b94cea1d4badd6275c2ba1a8b1beed30cc8e8c5655e7ce5646c605e11b4675d6ddeb43b859162b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorpalette.sty \
tex-symbolpalette.sty \
texlive-palette"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-macrolist.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
