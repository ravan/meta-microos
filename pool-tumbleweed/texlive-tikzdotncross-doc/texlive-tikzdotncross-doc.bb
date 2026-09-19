SUMMARY = "Documentation for texlive-tikzdotncross"
DESCRIPTION = "This package includes the documentation for texlive-tikzdotncross"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3bsvn77050"

RPM_NAME = "texlive-tikzdotncross-doc-2026.226.1.3bsvn77050-59.2.noarch.rpm"
RPM_HASH = "6a2168faf2b40821d839d1c9cbc2466ff740df4a977721b3f279dcd52ed3ccb2c782b72a337d2926e18854b0e734925619c542c48d1e1bf670c29709d7b4e67f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzdotncross-doc"

RDEPENDS:${PN} += ""

inherit rpm
