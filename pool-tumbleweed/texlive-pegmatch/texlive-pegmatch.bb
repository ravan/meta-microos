SUMMARY = "Parsing Expression Grammars for TeX"
DESCRIPTION = "This package ports PEG (Parsing Expression Grammars) to TeX. \
Following the design in LPEG (Parsing Expression Grammars for \
Lua), it defines patterns as LaTeX3 variables, and offers \
several operators to compose patterns. In general, PEG matching \
is much more powerful than RE (Regular Expressions) matching."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025bsvn76924"

RPM_NAME = "texlive-pegmatch-2026.226.2025bsvn76924-58.2.noarch.rpm"
RPM_HASH = "cf2f7d15e8593d6cd7454714a7456ab076a778937dd0620434aeacec27256e189e80912550393e1365e158ab6223dcbe4150be8fed1e1c9fa42e7276914a98d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pegmatch.sty \
texlive-pegmatch"

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
