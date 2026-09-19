SUMMARY = "Check if a given input string is a number or dimension for TeX"
DESCRIPTION = "This package provides three macros: \\ifisint, \\ifisdim, and \
\\ifisglue. They test if a given input string represents either \
a valid integer or a valid dimension or a valid (mu)glue \
specification for TeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0svn75195"

RPM_NAME = "texlive-ifis-macros-2026.226.2.0svn75195-60.2.noarch.rpm"
RPM_HASH = "5e7427891b8ecb3638bb050b0445c508d846b41f7c78f41218e8d304204bf5cbf9769615432c033780709dcd111f3fc7f601a4db2071b57ffacc55bb3e50834d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifisdimension.tex \
tex-ifisglue.tex \
tex-ifisinteger.tex \
texlive-ifis-macros"

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
