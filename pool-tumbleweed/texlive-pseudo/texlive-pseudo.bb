SUMMARY = "Straightforward pseudocode"
DESCRIPTION = "The package permits writing pseudocode without much fuss and \
with quite a bit of configurability. Its main environment \
combines aspects of enumeration, tabbing and tabular for \
nonintrusive line numbering, indentation and highlighting, and \
there is functionality for typesetting common syntactic \
elements such as keywords, identifiers, and comments. The \
package relies on aliascnt, array, colortbl, expl3, l3keys2e, \
xcolor, and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.3svn76924"

RPM_NAME = "texlive-pseudo-2026.226.1.2.3svn76924-59.2.noarch.rpm"
RPM_HASH = "b2a3c2e035ed2d8f59949f76db005f6a9f776c150077e69af9ba4bdb493e86ffecfd69763a74892c32a4d1aa16c8b3a8f2f32aa3053d4296c5455a8f7efefbc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pseudo.sty \
texlive-pseudo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aliascnt.sty \
tex-array.sty \
tex-colortbl.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-pgfkeys.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
