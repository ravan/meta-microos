SUMMARY = "Documentation for texlive-figbib"
DESCRIPTION = "This package includes the documentation for texlive-figbib"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn19388"

RPM_NAME = "texlive-figbib-doc-2026.226.svn19388-59.2.noarch.rpm"
RPM_HASH = "8c877fae5ea48037dcd08de89561fbc0d5cb780c00889d3cc3292c4e22d1e2eb7b01e07893d973932bd74e5c55e528e27ed8175dbe4c9abde57d7097ed87d8b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
