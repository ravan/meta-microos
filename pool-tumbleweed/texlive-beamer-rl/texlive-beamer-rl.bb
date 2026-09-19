SUMMARY = "Right to left presentation with beamer and babel"
DESCRIPTION = "This class provides patches of some beamer templates and \
commands for presentation from right to left. It requires Babel \
with the LuaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.2svn76587"

RPM_NAME = "texlive-beamer-rl-2026.226.2svn76587-61.2.noarch.rpm"
RPM_HASH = "155683b14153cec1b473ed79ce468e8e962db1136eae439feafb64668b67edf8312779894a8d5683c1ea1844895d2e8be5ca5b6a007430ca5470f3115214939c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamer-rl.cls \
tex-pgfpages-rl.sty \
texlive-beamer-rl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-beamer.cls \
tex-ifluatex.sty \
tex-pgfpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
