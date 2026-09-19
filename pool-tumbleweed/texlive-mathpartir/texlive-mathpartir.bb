SUMMARY = "Typesetting sequences of math formulas, e.g. type inference rules"
DESCRIPTION = "The package provides macros for typesetting math formulas in \
mixed horizontal and vertical mode, automatically as best fit. \
It provides an environment mathpar that behaves much as a loose \
centered paragraph where words are math formulas, and spaces \
between them are larger and adjustable. It also provides a \
macro \\inferrule for typesetting fractions where both the \
numerator and denominator may be sequences of formulas that \
will be also typeset in a similar way. It can typically be used \
for typesetting sets of type inference rules or typing \
derivations. A macro inferrule for typesetting type inference \
rules."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3.2svn77682"

RPM_NAME = "texlive-mathpartir-2026.226.1.3.2svn77682-59.2.noarch.rpm"
RPM_HASH = "866a4522a3bafe507c2468e9b245a021e9f18d8bec6630aedbcf0ef5778190a60ff7d963731569c2830b3147362b1e614f8eebfbdc1b466248da0ecf6df2443a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathpartir.sty \
texlive-mathpartir"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
