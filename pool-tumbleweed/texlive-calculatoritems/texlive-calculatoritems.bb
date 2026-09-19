SUMMARY = "Insert menus/items for classic calculators"
DESCRIPTION = "Insert inline (based on tcolorbox, graphicx and calc packages) \
items/menus for classic calculators (numworks, casio, texas \
instruments, hp)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.4svn76037"

RPM_NAME = "texlive-calculatoritems-2026.226.0.0.1.4svn76037-59.2.noarch.rpm"
RPM_HASH = "56754c3c1b316be813ebfd5ed3dfbb713733f00c1686f11854d7c29e21c3711f370aa55c2af88f08e14a03cd504ee2f3a81c7598f8145adb51c02d9a20f2f7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calculatoritems.sty \
texlive-calculatoritems"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-calc.sty \
tex-fontspec.sty \
tex-ifthen.sty \
tex-inlinegraphicx.sty \
tex-listofitems.sty \
tex-settobox.sty \
tex-simplekv.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
