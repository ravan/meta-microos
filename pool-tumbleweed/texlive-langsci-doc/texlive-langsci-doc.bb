SUMMARY = "Documentation for texlive-langsci"
DESCRIPTION = "This package includes the documentation for texlive-langsci"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73027"

RPM_NAME = "texlive-langsci-doc-2026.226.svn73027-63.2.noarch.rpm"
RPM_HASH = "e0446ebf58c7c15c3cc54d9a569938c4ea359831cc4373974119339efae8be054541e65ee56dbf85ee47892d8f34921295bcb700aa53e33a64d5abc18ce325ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langsci-doc"

RDEPENDS:${PN} += ""

inherit rpm
