SUMMARY = "Miscellaneous macros by Peter Williams"
DESCRIPTION = "The bundle provides two packages: antree, which provides macros \
for annotated node trees, and toklist, which is an \
implementation of Knuth's token list macros, to be found on \
pp.378-379 of the TeXbook."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-williams-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "e870fd9b1aa3f6458e3669d56bf9e49c9fc402956de237761dfa5145f1ae8bf993dc38b5b28e8842d420c30d761fb111054ece2ecfbd09e5c9af915956f3ef31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-antree.sty \
tex-toklist.sty \
texlive-williams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eepic.sty \
tex-epic.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
