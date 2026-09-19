SUMMARY = "Language for numeric tables"
DESCRIPTION = "The calctab package helps the user to typeset a kind of \
economic table such as invoices, expense notes and liquidation, \
or other tabular material with a values column. The code \
computes sum and percentage with floating point numeric methods \
(using the fltpoint package) and builds the render table task."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.1svn15878"

RPM_NAME = "texlive-calctab-2026.226.0.0.6.1svn15878-59.2.noarch.rpm"
RPM_HASH = "ee1e58eb866f80fed7384528a0272d64f4e7bf96464d69f7b31e3553b33cf78cf1420f4ca9f7070285d93feffa44e0d5d74d0be803bc511476de2acbd52f8c72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calctab.sty \
texlive-calctab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-booktabs.sty \
tex-eurosym.sty \
tex-fltpoint.sty \
tex-ifthen.sty \
tex-numprint.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
