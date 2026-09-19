SUMMARY = "Typeset lists as tables"
DESCRIPTION = "The listliketab package helps the user make list-like tabulars, \
i.e., a tabular that is indistinguishable from an itemize or \
enumerate environment. The advantage of using a tabular is that \
the user can add additional columns to each entry in the list."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-listliketab-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "0600f4d8bac567e48879d5597cccff65c88bd2655e12455cab0f79e64182bde2a36a2a976ef62ab57f6977f77d6ecd2a423e445d0eb6d660aebfabd25d5a1de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listliketab.sty \
texlive-listliketab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
