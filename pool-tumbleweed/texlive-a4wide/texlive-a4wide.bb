SUMMARY = "'Wide' a4 layout"
DESCRIPTION = "This package increases the width of the typeset area of an a4 \
page. This sort of operation is capable of producing \
typographically poor results; the operation itself is better \
provided by the geometry package. The package uses the a4 \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-a4wide-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "92a53feb6727dddbf2311b37561ae61790ecae268477a2d1d9348c8eff8eb624a62d6158de6478710af4d60c5132eb2913fadee66add8d8bd3b45831147e3870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a4wide.sty \
texlive-a4wide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
