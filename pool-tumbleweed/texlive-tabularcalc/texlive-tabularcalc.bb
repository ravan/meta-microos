SUMMARY = "Calculate formulas in a tabular environment"
DESCRIPTION = "Given a list of numbers and one (or more) formulas, the package \
offers an easy syntax to build a table of values, i.e., a \
tabular in which the first row contains the list of numbers, \
and the other rows contain the calculated values of the \
formulas for each number of the list. The table may be built \
either horizontally or vertically and is fully customizable."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2svn77682"

RPM_NAME = "texlive-tabularcalc-2026.227.0.0.2svn77682-62.2.noarch.rpm"
RPM_HASH = "056af5060ac9af81fe28c30232de1be7a4243b8a0b7c554e619414804deb3e26977b44cb3b5597ac80ec0ecb5ab22d76169d30e85d07badebc749d80bc35c810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabularcalc.sty \
texlive-tabularcalc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-numprint.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
