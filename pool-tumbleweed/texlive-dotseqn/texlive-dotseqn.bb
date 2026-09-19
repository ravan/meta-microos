SUMMARY = "Flush left equations with dotted leaders to the numbers"
DESCRIPTION = "The package provides a different format for typesetting \
equations, one reportedly used in 'old style Britsh books': \
equations aligned on the left, with dots on the right leading \
to the equation number. In default of an equation number, the \
package operates much like the fleqn class option (no leaders)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-dotseqn-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "fa34455bd02a77bad5f76a7453c492bf653450d7486ecfbcf3704c961b194f1b116072539df49f5a33f098b4d8c6e04ccfc0cbfc298fada8d463a39d7c2a1c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dotseqn.sty \
texlive-dotseqn"

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
