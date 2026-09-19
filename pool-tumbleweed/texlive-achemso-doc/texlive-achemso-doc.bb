SUMMARY = "Documentation for texlive-achemso"
DESCRIPTION = "This package includes the documentation for texlive-achemso"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.14svn76790"

RPM_NAME = "texlive-achemso-doc-2026.226.3.14svn76790-61.2.noarch.rpm"
RPM_HASH = "714b6ebc5b9a9a0a8344387b79181f46f822b1c98c5999e2166b06cdd05fa4e1d47c05814381ec64cf83b9a6faf8b26261c928b3521d071dd8895099d328a72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-achemso-doc"

RDEPENDS:${PN} += ""

inherit rpm
