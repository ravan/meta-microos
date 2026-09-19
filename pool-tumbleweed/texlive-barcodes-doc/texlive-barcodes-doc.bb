SUMMARY = "Documentation for texlive-barcodes"
DESCRIPTION = "This package includes the documentation for texlive-barcodes"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-barcodes-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "82a38db7d708325d54dfe3f8d359d7c9c9804287f365f4d19b0ba4b3b132725a868aad380be4f5ca97d8f600947d924144fa8f0a489596809d531e90b3cdb246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-barcodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
