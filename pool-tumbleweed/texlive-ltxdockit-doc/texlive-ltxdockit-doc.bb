SUMMARY = "Documentation for texlive-ltxdockit"
DESCRIPTION = "This package includes the documentation for texlive-ltxdockit"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn21869"

RPM_NAME = "texlive-ltxdockit-doc-2026.226.1.2dsvn21869-59.2.noarch.rpm"
RPM_HASH = "fa9116423a9ba9f840a5c592d0471c9bdfa3e90003710928081019216b4ceb9ce636977f78740bfe56a2a9e2185f8c85cf40956946a13606ed482631396945bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxdockit-doc"

RDEPENDS:${PN} += ""

inherit rpm
