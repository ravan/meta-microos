SUMMARY = "Colors definitions, theorems, corollaries, lemmas, and propositions"
DESCRIPTION = "This LaTeX package introduces the 'Gratzer Color Scheme' for \
math publications, which colors theorems and corollaries red, \
lemmas and propositions blue, definitions green."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn73199"

RPM_NAME = "texlive-gratzer-color-scheme-2026.226.1.0svn73199-60.4.noarch.rpm"
RPM_HASH = "3a81b6541eed59ebdadf907d3b393a316110e75cf80ccbaa7e5e7488f7adba22c0cc1033086e809b1040f2ac5d07b68bdf582aeca732c886e06f4d6682e075ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Gratzer-Color-Scheme.sty \
texlive-gratzer-color-scheme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
