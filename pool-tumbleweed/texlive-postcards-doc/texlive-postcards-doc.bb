SUMMARY = "Documentation for texlive-postcards"
DESCRIPTION = "This package includes the documentation for texlive-postcards"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75878"

RPM_NAME = "texlive-postcards-doc-2026.226.svn75878-59.2.noarch.rpm"
RPM_HASH = "852fea38cc849ed26218e36a75051a4ba52ae4256006d734d5eb94352c0c85575dec11651865fe915ec20ba641720706fbcba3ef313c3d2f31b9135012aaeec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-postcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
