SUMMARY = "Documentation for texlive-algorithmicx"
DESCRIPTION = "This package includes the documentation for texlive-algorithmicx"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-algorithmicx-doc-2026.226.svn78101-61.2.noarch.rpm"
RPM_HASH = "535630ead00d0ae8d9fbbe114824d5818f31135b9dc3375d1eb57c89839e24899c68381d428804cb84e419ece1207cfe1aadb5b109b411c5ecade4f706a34d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algorithmicx-doc"

RDEPENDS:${PN} += ""

inherit rpm
