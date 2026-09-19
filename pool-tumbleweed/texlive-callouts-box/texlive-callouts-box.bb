SUMMARY = "Provides visually appealing callout boxes"
DESCRIPTION = "This package provides a collection of visually appealing, \
structured callout boxes for LaTeX documents. These boxes are \
useful for highlighting important information such as warnings, \
errors, notes, and success messages. The package is built on \
top of tcolorbox for highly customizable, breakable callout \
boxes and xcolor for predefined color schemes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn74635"

RPM_NAME = "texlive-callouts-box-2026.226.1.1svn74635-59.2.noarch.rpm"
RPM_HASH = "13ea520c994469718b7c88c0f1044ec97b38ac231fd4fcb6f9ee8bffe2c8ff805f63b9befff963cfb233a3af91f4ae944be973d846a4dc64df0fc14f8708dbc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-callouts-box-colors.sty \
tex-callouts-box.sty \
texlive-callouts-box"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
