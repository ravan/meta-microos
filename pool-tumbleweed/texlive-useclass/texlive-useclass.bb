SUMMARY = "Load classes as packages"
DESCRIPTION = "This package enables the usage of classes as packages. It was \
originally designed for the l3doc class, which is employed for \
documenting LaTeX code with numerous useful features. However, \
employing the l3doc class as a package is not convenient when \
using the developing class as the style for the document. \
Therefore, this package provides a simple interface for \
utilizing classes as packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-useclass-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "ca7c9cc7c0dcbb2ff6b02d41b896433cdcc02399ca2055d85417ba446990579572040b41bc6c5fdc2c06e31c3d72063cdb71a5c4585e12ed6ee82a042c808bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-useclass.sty \
texlive-useclass"

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
