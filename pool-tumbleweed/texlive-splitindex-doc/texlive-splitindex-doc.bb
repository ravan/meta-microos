SUMMARY = "Documentation for texlive-splitindex"
DESCRIPTION = "This package includes the documentation for texlive-splitindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2csvn77682"

RPM_NAME = "texlive-splitindex-doc-2026.226.1.2csvn77682-64.2.noarch.rpm"
RPM_HASH = "eb050a9090cdcf252996672c0bde29804873f39ba2afd398d56021e5683e9405c1878039c7c1f92102c96e0fda41fdd1badf9bc539b29a5252e7d25937f2e46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-splitindex.1 \
texlive-splitindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
