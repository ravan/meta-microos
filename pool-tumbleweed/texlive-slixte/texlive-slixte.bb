SUMMARY = "A customizable class for creating slides"
DESCRIPTION = "This class creates customizable slides and is mostly powered by \
the beamer class and the tikz package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76913"

RPM_NAME = "texlive-slixte-2026.226.svn76913-64.2.noarch.rpm"
RPM_HASH = "d93aaad2dcaa1208dc0e28211b346941440ef922b22ba0b4fdf696db26b000ba62cc4198183994ff786022a0676e27ba3717baa4363878b20b0cd32845063830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-slixte.cls \
texlive-slixte"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bbm.sty \
tex-beamer.cls \
tex-contour.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fontawesome.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-lmodern.sty \
tex-refcount.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xfp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
