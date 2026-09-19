SUMMARY = "Typeset logic formulae, etcetera"
DESCRIPTION = "The package provides a facility to typeset certain logic \
formulae. It provides an environment like eqnarray, a \
newtheorem-like environment (NewTheorem), and several macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn75878"

RPM_NAME = "texlive-gene-logic-2026.226.1.4svn75878-60.2.noarch.rpm"
RPM_HASH = "29bfe9d0888688fed9df0e78c9c5eac43259c9046e36640ab3dc6366e03a909a410cf11f1adcefa48bef30c3f45d7e17506b5dcad0a7db258bf5bd52ebf8a321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gn-logic14.sty \
texlive-gene-logic"

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
