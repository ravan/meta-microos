SUMMARY = "Documentation for texlive-quantumcubemodel"
DESCRIPTION = "This package includes the documentation for texlive-quantumcubemodel"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn77308"

RPM_NAME = "texlive-quantumcubemodel-doc-2026.226.0.0.2.0svn77308-60.4.noarch.rpm"
RPM_HASH = "fdabfbfbc496626b0fcd60f0a7d8354ffa5ad89e32b87aa69a2a0a6acb2a810267495bbaa2808c7267fb81582f223c709577cebfd632f41d928aaf57b0631a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantumcubemodel-doc"

RDEPENDS:${PN} += ""

inherit rpm
