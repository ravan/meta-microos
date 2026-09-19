SUMMARY = "Bulgarian translation of the pst-eucl documentation"
DESCRIPTION = "The pst-eucl package documentation in Bulgarian language - \
Euclidean Geometry with PSTricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn19296"

RPM_NAME = "texlive-pst-eucl-translation-bg-2026.226.1.3.2svn19296-59.2.noarch.rpm"
RPM_HASH = "dc923625f3b9b8d16d656508cf64d61dc3702c6c352d3ea54b77f3e210d4b2e62710fcec56f9bab31c77390440c7ada8aefdae9cde85e9cc18640a1056a38db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-eucl-translation-bg"

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
