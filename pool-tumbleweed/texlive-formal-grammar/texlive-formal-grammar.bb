SUMMARY = "Typeset formal grammars"
DESCRIPTION = "This package provides a new environment and associated commands \
to typeset BNF grammars. It allows to easily write formal \
grammars. Its original motivation was to typeset grammars for \
beamer presentations, therefore, there are macros to emphasize \
or downplay some parts of the grammar (which is the main \
novelty compared to other BNF packages)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn61955"

RPM_NAME = "texlive-formal-grammar-2026.226.1.2svn61955-60.2.noarch.rpm"
RPM_HASH = "e1623ea2bafbf27f95dbf74bbf502e852274b3e817fdd355ef4a035321f9be533dda074e2fa23456d199886be17f8af915228afacef218b94eab1858625349a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-formal-grammar.sty \
texlive-formal-grammar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-colortbl.sty \
tex-newfloat.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
