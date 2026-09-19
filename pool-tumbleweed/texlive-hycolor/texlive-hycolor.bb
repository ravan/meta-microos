SUMMARY = "Implements colour for packages hyperref and bookmark"
DESCRIPTION = "This package provides the code for the color option that is \
used by packages hyperref and bookmark. It is not intended as \
package for the user."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn77682"

RPM_NAME = "texlive-hycolor-2026.226.1.10svn77682-60.2.noarch.rpm"
RPM_HASH = "d163a1ce3f6be65572f3c56a8ae1a0d3a3ddc3b1f795c157455044a23934bdca152eebe0b7e55c526d8e276936464f6e8166cb3ea9d8116fa386cd1c436f5bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hycolor.sty \
tex-xcolor-patch.sty \
texlive-hycolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hopatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
