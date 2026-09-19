SUMMARY = "Print a calendar for a group of years"
DESCRIPTION = "The package prints a calendar for two or more years, according \
to a language selection. The package is also 'culture \
dependent' in the sense that it will start weeks according to \
local rules: e.g., weeks conventionally start on Monday in the \
English-speaking world. The package requires array, babel, and \
geometry."
LICENSE = "LPPL-1.0"

PV = "2026.226.20.26asvn77222"

RPM_NAME = "texlive-calxxxx-yyyy-2026.226.20.26asvn77222-59.2.noarch.rpm"
RPM_HASH = "157bba961663cea6426ceec8ca70afd19796755c2f7cc9cd91a030c5c02cbeeb4ad822b4f4a727b8e881d90e43a7869c577b6c4fb49dac77160e805531b9bde6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calxxxx-yyyy-doc.tex \
tex-calxxxx-yyyy.tex \
texlive-calxxxx-yyyy"

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
