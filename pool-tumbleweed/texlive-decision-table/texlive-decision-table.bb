SUMMARY = "An easy way to create Decision Model and Notation decision tables"
DESCRIPTION = "The decision-table package allows for an easy way to generate \
decision tables in the Decision Model and Notation (DMN) \
format. This package ensures consistency in the tables (i.e. \
fontsize), and is thus a better alternative to inserting tables \
via images. The decision-table package adds the \\dmntable \
command, with which tables can be created. This command expands \
into a tabular, so it can be used within a table or figure \
environment. Furthermore, this allows labels and captions to be \
added seamlessly. It is also possible to place multiple DMN \
tables in one table/figure environment. The package relies on \
nicematrix and l3keys2e."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.4svn76924"

RPM_NAME = "texlive-decision-table-2026.226.0.0.0.4svn76924-59.2.noarch.rpm"
RPM_HASH = "ffaa7bbf75a383ae1ecf055ec1c1228e4e34541b92657cab207b8ee8429d83292dbe788c9e4a07fa025834ed4b623f546c88d3899cbd4d89b2ef0f9160c0615c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-decision-table.sty \
texlive-decision-table"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-nicematrix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
