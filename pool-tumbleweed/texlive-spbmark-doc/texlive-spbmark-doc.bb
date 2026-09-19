SUMMARY = "Documentation for texlive-spbmark"
DESCRIPTION = "This package includes the documentation for texlive-spbmark"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.46ysvn76924"

RPM_NAME = "texlive-spbmark-doc-2026.226.1.46ysvn76924-64.2.noarch.rpm"
RPM_HASH = "dea41df1b53e101e2d319ea2272cee5f9ccd49710a698fbe4ec5761a64a9b8c78ab81544247c8ae8a74ac1712ab9e69d1ff2f88edf9faf871c4e4737a0b65ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spbmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
