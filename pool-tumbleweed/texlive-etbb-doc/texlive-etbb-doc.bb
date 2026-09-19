SUMMARY = "Documentation for texlive-etbb"
DESCRIPTION = "This package includes the documentation for texlive-etbb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.057svn69098"

RPM_NAME = "texlive-etbb-doc-2026.226.1.057svn69098-59.2.noarch.rpm"
RPM_HASH = "cba199596856a6ce2f5ee30f79c906374f43dc95110366a71079e53c5141645a89c03407e19c1a8bd813a290ec1d85b7a1d29aaf5f9c8e2493f054147c2f9afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
