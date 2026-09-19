SUMMARY = "Typeset simple school cafeteria menus"
DESCRIPTION = "This package provides a flexible LaTeX2e class for typesetting \
school cafeteria menus consisting of two lunches (with \
dessert), and dinner. It supports two different layouts: The \
first layout is optimized for printing the menu on A4 paper. \
The second layout is optimized for smartphone screens and uses \
one (A6 sized) page per day. Supported localizations are \
English (GB/US) and German. A way of defining additional \
localizations is described in the documentation. The package \
requires array, colortbl, datetime2, datetime2-calc, geometry, \
graphicx, lmodern, textcomp, and xcolor."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45997"

RPM_NAME = "texlive-mensa-tex-2026.226.svn45997-59.2.noarch.rpm"
RPM_HASH = "abc2decb90cb5a17bf6dd77c479cb3186d118eaa01b83a6650774bf924fb108f838ab2b6e5db4b75325a19213f8bda2b70ada2437d1c94e927a6c194460cea33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mensa-tex.cls \
texlive-mensa-tex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-datetime2-calc.sty \
tex-datetime2.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-lmodern.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
