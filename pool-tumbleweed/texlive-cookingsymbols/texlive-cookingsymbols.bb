SUMMARY = "Symbols for recipes"
DESCRIPTION = "The package provides 11 symbols for typesetting recipes: oven, \
gasstove, topheat, fanoven, gloves and dish symbol (among \
others). The symbols are defined using Metafont."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn74247"

RPM_NAME = "texlive-cookingsymbols-2026.226.1.1svn74247-61.2.noarch.rpm"
RPM_HASH = "802b8ae012425bad60ce6682f0257bf3e28ac46afe0943eb4ce66dc7cff474ae8b842b5d4fe219ff7920fab027ff4278ef1b55873339fe319578471a8df49659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cookingsymbols.sty \
tex-cookingsymbols.tfm \
texlive-cookingsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
