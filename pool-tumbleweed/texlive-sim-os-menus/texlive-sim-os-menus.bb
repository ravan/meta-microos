SUMMARY = "Insert 'terminal' or 'context menu' or 'viewers' like in an OS"
DESCRIPTION = "This is a package to present, like in an OS: a fake terminal \
(with tcolorbox); a fake context menu with sub-menus (with \
TikZ); a fake viewer (with tcolorbox)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.9svn75975"

RPM_NAME = "texlive-sim-os-menus-2026.226.0.0.1.9svn75975-60.2.noarch.rpm"
RPM_HASH = "fbb84f4279629dd7a9d64b1b110a79a669fb68f5b7bf982e56fb66793d2e6039be6a8131f3a16a399da6bd52ab7092a7f68bbfc00a3e1eca29b28c056598082c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sim-os-menus.sty \
texlive-sim-os-menus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fontawesome5.sty \
tex-fontawesome6.sty \
tex-fontawesome7.sty \
tex-forest.sty \
tex-listofitems.sty \
tex-pgf.sty \
tex-pgffor.sty \
tex-settobox.sty \
tex-simplekv.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
